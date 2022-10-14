package com.jspider.Trail_02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/response")
public class AddingServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int sum = Integer.parseInt(req.getParameter("sum"));
		
		PrintWriter out = resp.getWriter();
		out.println("<h1 style='color:blue;'>"+"sum: "+sum+"</h1>");
	}
}
