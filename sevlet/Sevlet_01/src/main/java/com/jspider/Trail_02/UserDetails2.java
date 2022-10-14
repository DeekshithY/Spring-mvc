package com.jspider.Trail_02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/give")
public class UserDetails2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		PrintWriter  out=resp.getWriter();
		out.println("<h1>"+"Hellow user "+name+"</h1>");
		out.println("<h1>"+"new password :"+password+"</h1>");
	}
}
