package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
        System.out.println("execute!!");
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
        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }
        if(invoiceBean.getDateFrom()==null) {
            addFieldError("invoiceBean.dateFrom", "Introduzca una fecha.");
        }
        if(invoiceBean.getDateTo()==null) {
            addFieldError("invoiceBean.dateTo", "Introduzca una fecha.");
        }
        if(invoiceBean.getImporteBruto().isEmpty()) {
            addFieldError("invoiceBean.importeBruto", "Introduzca un importe");
        }
        if(invoiceBean.getTipoIVA().isEmpty()) {
            addFieldError("invoiceBean.tipoIVA", "Introduzca el tipo de IVA");
        }
    }
}
