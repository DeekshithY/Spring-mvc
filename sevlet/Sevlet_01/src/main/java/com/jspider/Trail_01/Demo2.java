package com.jspider.Trail_01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clickonce")
public class Demo2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		
		String sum2 = (String) req.getAttribute("sum2");//here using req
		
		String sum1=resp.getHeader("sum");				//here using resp

		out.println("<h1>" + "sum : " + sum1 + "</h1>");
		out.println("<h1>" + "sum2 : " + sum2 + "</h1>");

	}
}
