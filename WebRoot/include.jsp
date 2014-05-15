<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
<head>
<title>forward Page</title>
</head>
<body>
	<jsp:include page="forwardTo.jsp">
		<jsp:param value="liming" name="username" />
	</jsp:include>
</body>
</html>