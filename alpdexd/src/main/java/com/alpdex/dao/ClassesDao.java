package com.alpdex.dao;

import javax.persistence.EntityManager;

import com.alpdex.entity.Classes;

public class ClassesDao {

	private EntityManager em;
	
	public ClassesDao(EntityManager em) {
		this.em = em;
	}
	
	public void insert(Classes teacherClass) {
		this.em.persist(teacherClass);
	}
	
	
}
