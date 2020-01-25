<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html locale="true">
<html:errors />
<html:form action="/profile" >
<html:hidden property="method" value="edit" />

<center> <html:submit property="submit" value="Edit"/> </center>
 

</html:form>


</html:html>