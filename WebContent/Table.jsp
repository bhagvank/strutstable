<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
<html:form action="/table" >
<center>


<table>

<tr>

<td> <html:text property="rows[0].columns[0].value" />  </td> 

<td> <html:text property="rows[0].columns[1].value" /></td>

</tr>
<tr>

<td> <html:text property="rows[1].columns[0].value" />  </td> 

<td> <html:text property="rows[1].columns[1].value" /></td>

</tr>

</table>


</center>

<center> <html:submit property="submit" value="Submit"/> </center>
</html:form>




</html:html>