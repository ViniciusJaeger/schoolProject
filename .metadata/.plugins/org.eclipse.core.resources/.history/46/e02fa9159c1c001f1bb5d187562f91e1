package com.alpdex.demo;

import javax.persistence.EntityManager;

import com.alpdex.dao.StudentDao;
import com.alpdex.entity.Student;
import com.alpdex.utils.JPAUtil;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.setName("Lucas");
		st.setAge(19);
		st.setGrade(3);
		
		EntityManager em = JPAUtil.getEntityManager();
		StudentDao dao = new StudentDao(em);
		
		em.getTransaction().begin();
		dao.insert(st);
		em.getTransaction().commit();
		em.close();
	}
}
