package com.jspider.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.dto.Student;
import com.jspider.service.StudentService;

public class StudentGetById extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));

		
		StudentService service = new StudentService();
		Student student = service.getById(id);
		PrintWriter printWriter = resp.getWriter();
		if (student != null) {
			
			printWriter.println("<h1>" + student.getId() + "</h1>");
			printWriter.println("<h1>" + student.getName() + "</h1>");
			printWriter.println("<h1>" + student.getEmail() + "</h1>");
			printWriter.println("<h1>" + student.getQ() + "</h1>");
			printWriter.println("<h1>" + student.getGender() + "</h1>");
		}else {
			printWriter.println(" invalid id/or not present");
		}
		ServletContext  context=getServletContext();
		System.out.println(context.getInitParameter("a1"));
		System.out.println(context.getInitParameter("a2"));
		
		
	ServletConfig config	=getServletConfig();
	System.out.println(config.getInitParameter("API"));
	}
}
