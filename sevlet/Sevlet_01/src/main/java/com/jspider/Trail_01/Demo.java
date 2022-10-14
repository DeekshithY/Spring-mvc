package com.jspider.Trail_01;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/click")
public class Demo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		int num1=Integer.parseInt(req.getParameter("n1"));
		int num2=Integer.parseInt(req.getParameter("n2"));
		String sum=num1+num2+"";
		String sum2=num1-num2+"";
		
		resp.addHeader("sum", sum);//using resp
	
		req.setAttribute("sum2",sum2);//using req
	
		RequestDispatcher dispatcher=req.getRequestDispatcher("/clickonce");
		
		dispatcher.forward(req, resp);
	}
}
