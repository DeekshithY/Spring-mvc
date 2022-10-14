package com.jspider.Jsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jspider.Trail_03.Student;

@WebServlet("/jsp")
public class Sevletjsp1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student student=new Student(1, "jon");
		
		HttpSession httpSession=req.getSession();
		httpSession.setAttribute("student", student);
		resp.sendRedirect("jsp2.jsp");
	}
}
