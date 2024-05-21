package com.alpdex.dao;

import javax.persistence.EntityManager;

import com.alpdex.entity.Graduation;

public class GraduationDao {

	private EntityManager em;

	public GraduationDao(EntityManager em) {
		this.em = em;
	}
	
	public void insert(Graduation graduation) {
		this.em.persist(graduation);
	}
}
