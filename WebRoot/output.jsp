<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'output.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<%
		int row = Integer.parseInt(request.getParameter("row"));

		int col = Integer.parseInt(request.getParameter("col"));
		
		int value = 0;
	%>
	<table border="1" width="80%" align="center">
		<%
			for (int i = 0; i < row; i++)
			{
		%>
		<tr>
			<%
				for (int j = 0; j < col; j++)
					{
			%>
			<td>
				<%= ++value %>
			</td>

			<%
				}
			%>

		</tr>

		<%
			}
		%>
	</table>




</body>
</html>
