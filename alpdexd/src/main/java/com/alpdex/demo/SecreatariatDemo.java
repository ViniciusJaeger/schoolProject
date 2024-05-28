package com.alpdex.demo;

import javax.persistence.EntityManager;

import com.alpdex.dao.SecretariatDao;
import com.alpdex.entity.Secretariat;
import com.alpdex.utils.JPAUtil;

public class SecreatariatDemo {
	
	static EntityManager em = JPAUtil.getEntityManager();
	
	static SecretariatDao secretariatDao = new SecretariatDao(em);

	public static void main(String[] args) {
		
		Long sum = secretariatDao.studentControl();
		System.out.println(sum);
	}
	
	public static void registerSecretariat() {
		Secretariat s = new Secretariat();
		s.setName("Escola Carlos Henrique");
		
		em.getTransaction().begin();
		
		secretariatDao.insert(s);
		
		em.getTransaction().commit();

	}
	
	
}
