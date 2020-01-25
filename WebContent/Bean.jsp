<%@ page language="java" import="TableForm" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html locale="true">
<center>
<B>
 The values from the previous page
</B>

<table border=2>

<tr>
<td>
   <bean:write name="tableForm" property="rows[0].columns[0].value" />
</td>

<td>

<bean:write name="tableForm" property="rows[0].columns[1].value" />

</td>

</tr>

<tr>
<td>
   <bean:write  name="tableForm" property="rows[1].columns[0].value" />
</td>

<td>
   <bean:write name="tableForm" property="rows[1].columns[1].value" />
</td>

</tr>


</table>
</center>

</html:html>