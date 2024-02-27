package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
        System.out.println("execute!!");

        // Calculamos importe IVA e importe Total
        double valorimporteIVA =(invoiceBean.getTipoIVA())*(invoiceBean.getImporteBruto())/100;
        double valorimporteTotal= valorimporteIVA + invoiceBean.getImporteBruto();

        // Actualizzmos los atributos
        invoiceBean.setImporteIVA(valorimporteIVA);
        invoiceBean.setImporteTotal(valorimporteTotal);

        return SUCCESS;
    }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
    @Override
    public void validate() {
        // Validamos que no haya ningún campo vacio
        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }
        if(invoiceBean.getDateFrom()==null) {
            addFieldError("invoiceBean.dateFrom", "Introduzca una fecha.");
        }
        if(invoiceBean.getDateTo()==null) {
            addFieldError("invoiceBean.dateTo", "Introduzca una fecha.");
        }
        if(invoiceBean.getImporteBruto()<=0) {
            addFieldError("invoiceBean.importeBruto", "Introduzca un importe");
        }
        if(invoiceBean.getTipoIVA()==null) {
            addFieldError("invoiceBean.tipoIVA", "Introduzca el tipo de IVA");
        }
        // Validamos que las fecha desde sea menor o igual a la fecha hasta
        if(invoiceBean.getDateFrom()!=null || invoiceBean.getDateTo()!=null){
            if (invoiceBean.getDateFrom().after(invoiceBean.getDateTo())){
                addFieldError("invoiceBean.dateTo", "La fecha hasta debe ser mayor o igual a la fecha desde");
            }
        }

    }
}
