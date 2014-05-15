package com.org.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static int n = 0;
	
	private static final long serialVersionUID = -7903510563594239511L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		System.out.println("doGet invoked!");
		process(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		System.out.println("doPost invoked!");
		
		process(req, resp);
	}

	
	
	private void process(HttpServletRequest req, HttpServletResponse resp)
			throws IOException
	{
		n++;
		
		System.out.println("page reload " + n +" times.");
		
		resp.setContentType("text/html");

		String username = req.getParameter("username");
		
		int age = Integer.parseInt(req.getParameter("age")) ;

		String password = req.getParameter("password");
		
		String repassword = req.getParameter("repassword");

		PrintWriter out = resp.getWriter();

		out.write("<html>");

		out.write("<head>");

		out.write("<title>LoginServlet</title>");

		out.write("</head>");

		out.write("<body>");
		
		if (age<18 || age == 18)
		{
			out.write("Does not allow the user's age is less than 18 years old!</br>");
		}
		
		if (!password.equals(repassword))
		{
			out.write("Inconsistent user two passwords!</br>");
		}

		if (password.equals(repassword) && age > 18)
		{
			out.write("Congratulation: success");
		}
		
		out.write("</body>");

		out.write("</html>");
		
		out.flush();
	}
}
