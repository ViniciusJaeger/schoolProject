package com.alpdex.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("school");
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
