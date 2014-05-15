<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<!-- forwardTo Page -->
<%
	String username = request.getParameter("username");
	
	String outStr = "Ð»Ð»¹âÁÙ!--------";
	
	outStr+= username;
	
	out.write(outStr);
%>
