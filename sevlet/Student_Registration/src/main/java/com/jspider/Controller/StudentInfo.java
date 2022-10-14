package com.jspider.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.dao.StudentDao;
import com.jspider.dto.Student;
import com.jspider.service.StudentService;

public class StudentInfo extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String dob = req.getParameter("dob");
		String q = req.getParameter("q");

		Student student = new Student();
		student.setName(name);
		student.setEmail(email);
		student.setGender(gender);
		student.setDob(dob);
		student.setQ(q);
		StudentService dao = new StudentService();
		dao.saveStudent(student);

	}
}
