package com.jspider.Trail_03;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/action")
public class TestSecction extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Student student = new Student(1, "Deekshith");
		Student studendt1 = new Student(2, "rakshith");

		/*----------HttpSession---------*/
		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("student", student);
		httpSession.setAttribute("student1", studendt1);

		/*-----------Cookie------------------*/
		Cookie cookie =new Cookie("user", "admin");
		Cookie cookie1=new Cookie("num", "123123");
		
		resp.addCookie(cookie);
		resp.addCookie(cookie1);
		

		resp.sendRedirect("action2");
	}
}
