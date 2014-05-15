<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
  <head>  
    <title>forward Page</title>
  </head>
  
  <body>
    <jsp:forward page="forwardTo.jsp">
    	<jsp:param value="liliang" name="username"/>
    </jsp:forward>
  </body>
</html>
