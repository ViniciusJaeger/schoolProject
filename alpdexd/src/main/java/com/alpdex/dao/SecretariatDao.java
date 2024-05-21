package com.alpdex.dao;

import javax.persistence.EntityManager;

import com.alpdex.entity.Secretariat;

public class SecretariatDao {

	private EntityManager em;
	
	public SecretariatDao(EntityManager em) {
		this.em = em;
	}
	
	public void insert(Secretariat secretariat) {
		this.em.persist(secretariat);
	}
	
//	public Integer studentControl() {
//		String sql = "SELECT SUM(s.id) FROM Student s";
//		return em.createQuery(sql, Integer.class).getSingleResult();
//	}
}