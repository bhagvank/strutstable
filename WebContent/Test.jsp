<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">

<html:form action="/logon" >

<center>


<table>
<tr>

<td> Username  </td>


<td> <html:text property="username" size="16" maxlength="16"/>  </td>

<td> <html:errors property="username" /> </td>

</tr>
<tr>

<td> Password  </td>


<td> <html:password property="password" size="16" maxlength="16"
                    redisplay="false"/>  </td>
<td><html:errors property="password" /> </td>
</tr>
</table>


</center>
 <center> <html:submit property="submit" value="Submit"/> </center>
 

</html:form>


</html:html>