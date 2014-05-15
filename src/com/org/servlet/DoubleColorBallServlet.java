package com.org.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoubleColorBallServlet extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public DoubleColorBallServlet()
	{
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy()
	{
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		
		out.println("<HTML>");
		
		out.println("  <HEAD><TITLE>Double Color Ball Servlet</TITLE></HEAD>");
		
		out.println("  <BODY>");

		
		
		Set<Integer> set = new HashSet<Integer>();
		
		Random random = new Random();
		
		while(set.size() != 6)
		{
			int randomVal = random.nextInt(33) + 1;
			
			set.add(randomVal);
		}
		
		int randomVal = random.nextInt(16) + 1;
		
		String result = "red ball: ";
		
		for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();)
		{
			Integer integer = (Integer) iterator.next();
			
			result += integer + " ";
		}
		
		result += "<br>blue ball: " + randomVal;
		
		out.write("<h1>"+result+"</h1>");
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException
	{
		// Put your code here
	}

}
