package com.alpdex.dao;

import javax.persistence.EntityManager;

import com.alpdex.entity.Student;

public class StudentDao {

	private EntityManager em;

	public StudentDao(EntityManager em) {
		this.em = em;
	}
	
	public void insert(Student student) {
		this.em.persist(student);
	}
	
}
