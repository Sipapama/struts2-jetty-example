<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>

  <s:head/>
  <sx:head/>
</head>

<body>
    <h1>Resumen de factura: </h1>
    <b><label>Concepto: </label></b>
    <s:property value="invoiceBean.subject" /><br>
    <b><label>Fecha desde: </label></b>
    <s:property value="invoiceBean.dateFrom" /><br>
    <b><label>Fecha hasta: </label></b>
    <s:property value="invoiceBean.dateTo" /><br>
    <b><label>Importe: </label></b>
    <s:property value="invoiceBean.importeBruto" /><br>
    <b><label>IVA (%): </label></b>
    <s:property value="invoiceBean.tipoIVA" /><br>
    <b><label>Importe IVA: </label></b>
    <s:property value="invoiceBean.importeIVA" /><br>
    <b><label>Importe TOTAL: </label></b>
    <s:property value="invoiceBean.importeTotal" /><br>
</body>
</html>