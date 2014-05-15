package com.org.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 536562732763987906L;

	@Override
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		out.println("<html><head><title>Hello World</title></head></html>");

		out.println("<boty><h1>Hello Wrold: "+new Date().toLocaleString()+"</h1></body>");

		System.out.println(new Date().toLocaleString());
		
		out.flush();
	}
}
