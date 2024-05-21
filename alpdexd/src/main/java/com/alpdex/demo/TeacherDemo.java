package com.alpdex.demo;

import javax.persistence.EntityManager;

import com.alpdex.dao.GraduationDao;
import com.alpdex.dao.TeacherDao;
import com.alpdex.entity.Graduation;
import com.alpdex.entity.Teacher;
import com.alpdex.utils.JPAUtil;

public class TeacherDemo {

	public static void main(String[] args) {
//		insertTeacher();
		
		EntityManager em = JPAUtil.getEntityManager();
		TeacherDao teacherDao = new TeacherDao(em);
		
////		Teacher t = teacherDao.findById(2l);
////		System.out.println(t);
//		
////		List<Teacher> lt = teacherDao.findAll();
////	
////		for(Teacher ti : lt) {
////			System.out.println(ti);
////		}
//		
//		String lt = teacherDao.findByNameTeacher("Sabrine");
////		lt.forEach(l -> System.out.println(l));
//		System.out.println(lt);
		
	}
	
	
	public static void insertTeacher() {
		
		Graduation graduation = new Graduation();
		Teacher pr = new Teacher();
		
		graduation.setName("Bachelor of History");
		pr.setName("Sabrine");
		pr.setAge(34);
		pr.setGraduation(graduation);
		
		EntityManager em = JPAUtil.getEntityManager();
		GraduationDao graduationDao = new GraduationDao(em);
		TeacherDao teacherDao = new TeacherDao(em);
		
		em.getTransaction().begin();
		
		graduationDao.insert(graduation);
		teacherDao.insert(pr);
				
		em.flush();
		em.clear();	
	}
}
