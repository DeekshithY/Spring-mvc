package com.jspider.Trail_03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/action2")
public class TestSesstion2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession httpSession = req.getSession();
		Student student=new Student(3, "luya");
		httpSession.setAttribute("luya", student);

		Object object = httpSession.getAttribute("student");


		Cookie[] cookie=req.getCookies();
		String s="";
		String s1="";
		for(Cookie ele:cookie) {
			if(ele.getName().equals("user")) {
				s=ele.getValue();
			}
			if(ele.getName().equals("num")) {
				s1=ele.getValue();
			}
		}
		//resp.sendRedirect("third");
		PrintWriter out = resp.getWriter();
		out.println(s);
		out.println(s1);
		out.println(httpSession.getAttribute("student"));
		out.println(httpSession.getAttribute("student1"));
		out.println(httpSession.getAttribute("luya"));

	}
}
