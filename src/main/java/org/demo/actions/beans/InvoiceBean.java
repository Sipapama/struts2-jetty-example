package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {
    private String subject;
    private Date dateFrom;
    private Date dateTo;
    private double importeBruto;
    private Integer tipoIVA;
    private double importeIVA;
    private double importeTotal;


    public double getImporteBruto() {
        return importeBruto;
    }

    public void setImporteBruto(double importeBruto) {
        this.importeBruto = importeBruto;
    }

    public double getImporteIVA() {
        return importeIVA;
    }
    public void setImporteIVA(double importeIVA) {
        this.importeIVA = importeIVA;
    }
    public double getImporteTotal() {
        return importeTotal;
    }
    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
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
    public Integer getTipoIVA() {
        return tipoIVA;
    }
    public void setTipoIVA(Integer tipoIVA) {
        this.tipoIVA = tipoIVA;
    }
}
