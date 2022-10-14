package com.jspider.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.dto.Student;

public class StudentDao {
	public EntityManager getentityManager() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}

	public boolean saveStudent(Student student) {
		EntityManager entityManager = getentityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return true;
	}

	public Student getStudentById(int id) {
		return getentityManager().find(Student.class, id);
	}
}
