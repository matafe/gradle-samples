<jsp:useBean id="coreService1"
	class="com.matafe.application1.core.CoreService" />
<html>
<p>
	Direct access to appcore1:
	<br/><i>${coreService1.message}</i>
</p>
<br>
<a href="myWebServlet">Web Servlet (application 1)</a>
</html>