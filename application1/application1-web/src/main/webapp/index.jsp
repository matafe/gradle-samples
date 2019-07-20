<jsp:useBean id="coreService1"
	class="com.matafe.application1.core.CoreService" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>APP1</title>
</head>
<h1>APP1</h1>
<p>
	Direct access to appcore1:
	<br/><i>${coreService1.message}</i>
</p>
<br>
<a href="myWebServlet">Web Servlet (application 1)</a>
</html>