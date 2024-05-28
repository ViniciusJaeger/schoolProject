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
	
	public Long studentControl() {
		String sql = "SELECT COUNT(*) FROM Student s";
		return em.createQuery(sql, Long.class).getSingleResult();
	}
}
