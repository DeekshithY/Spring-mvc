package com.jspider.Trail_03;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/third")
public class TestSession3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession httpSession = req.getSession();
		httpSession.removeAttribute("student");

		PrintWriter out = resp.getWriter();
		out.println(httpSession.getAttribute("student"));
		out.println(httpSession.getAttribute("student1"));
		out.println(httpSession.getAttribute("luya"));
	}

}
