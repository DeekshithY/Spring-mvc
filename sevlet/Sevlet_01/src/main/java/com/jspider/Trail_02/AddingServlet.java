package com.jspider.Trail_02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/multiplication")
public class AddingServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String input1=req.getParameter("firstnum");
		String input2=req.getParameter("secondnum");
		
		int s1=Integer.parseInt(input1);
		int s2=Integer.parseInt(input2);
		
		int sum=s1+s2;
		resp.sendRedirect("response?sum="+sum);
	}
	

}
