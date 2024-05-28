package com.alpdex.demo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import com.alpdex.dao.ClassesDao;
import com.alpdex.dao.GraduationDao;
import com.alpdex.dao.TeacherDao;
import com.alpdex.entity.Classes;
import com.alpdex.entity.Graduation;
import com.alpdex.entity.Teacher;
import com.alpdex.utils.JPAUtil;


public class TeacherDemo {

	public static void main(String[] args) {
		insertTeacher();
		
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
		
		List<Teacher> ltRegisterDay = teacherDao.findByRegisterDay(LocalDate.parse("2024-05-18"));	
		
		ltRegisterDay.stream().forEach(System.out::println);
//		
//		String lt = teacherDao.findByNameTeacher("Sabrine");
////		lt.forEach(l -> System.out.println(l));
//		System.out.println(lt);
		
	}
	
	
	public static void insertTeacher() {
		
		Graduation graduation = new Graduation();
		Classes teacherClass = new Classes();
		Teacher pr = new Teacher();
		
		
		graduation.setName("BACHELOR OF ENGLISH");
		teacherClass.setName("3° FUNDAMENTAL B");
		pr.setName("Silvana");
		pr.setAge(36);
		pr.setGraduation(graduation);
		pr.setClasses(teacherClass);
		
		
		
		EntityManager em = JPAUtil.getEntityManager();
		GraduationDao graduationDao = new GraduationDao(em);
		ClassesDao classesDao = new ClassesDao(em);
		TeacherDao teacherDao = new TeacherDao(em);
		
		em.getTransaction().begin();
		
		classesDao.insert(teacherClass);
		graduationDao.insert(graduation);
		teacherDao.insert(pr);
				
		em.flush();
		em.clear();	
	}
}
