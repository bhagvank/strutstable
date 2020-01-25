<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
<html:errors />
<html:form action="/profile" >
<html:hidden property="method" value="save"/>

<center>


<table>
<tr>

<td> FirstName  </td>


<td> <html:text property="firstName" size="16" maxlength="16"/>  </td>

</tr>

<tr>

<td> LastName  </td>


<td> <html:text property="lastName" size="16" maxlength="16"/>  </td>

</tr>
<tr>

<td> MiddleName  </td>


<td> <html:text property="middleName" size="16" maxlength="16"/>  </td>

</tr>
</table>


</center>
 <center> <html:submit property="submit" value="Submit"/> </center>
 

</html:form>


</html:html>