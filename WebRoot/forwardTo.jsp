<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<!-- forwardTo Page -->
<%
	String username = request.getParameter("username");
	
	String outStr = "лл����!--------";
	
	outStr+= username;
	
	out.write(outStr);
%>
