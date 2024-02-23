package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {
    private String subject;
    private Date dateFrom;
    private Date dateTo;
    private String importeBruto;
    private String tipoIVA;

    public String getImporteBruto() {
        return importeBruto;
    }
    public void setImporteBruto(String importeBruto) {
        this.importeBruto = importeBruto;
    }
     public Date getDateFrom() {
        return dateFrom;
    }
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }
    public Date getDateTo() {
        return dateTo;
    }
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getTipoIVA() {
        return tipoIVA;
    }
    public void setTipoIVA(String tipoIVA) {
        this.tipoIVA = tipoIVA;
    }
}
