package com.jspider.service;

import com.jspider.dao.StudentDao;
import com.jspider.dto.Student;

public class StudentService {

	public boolean saveStudent(Student student) {
		StudentDao dao = new StudentDao();
		return dao.saveStudent(student);
	}

	public Student getById(int id) {
		return new StudentDao().getStudentById(id);
	}
}
