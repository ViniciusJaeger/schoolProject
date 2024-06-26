package com.alpdex.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import com.alpdex.entity.Teacher;

public class TeacherDao {

	private EntityManager em;

	public TeacherDao(EntityManager em) {
		this.em = em;
	}
	
	public void insert(Teacher teacher) {
		this.em.persist(teacher);
	}
	
	public void update(Teacher teacher) {
		this.em.merge(teacher);
	}
	
	public void remove(Teacher teacher) {
		teacher = em.merge(teacher);
		this.em.remove(teacher);
	}
	
	public Teacher findById(Long id) {
		return em.find(Teacher.class, id);
	}
	
	public List<Teacher> findAll() {
		String sql = "SELECT t FROM Teacher t";
		return em.createQuery(sql, Teacher.class).getResultList();
	}
	
	public List<Teacher> findByName(String name){
		String sql = "SELECT t FROM Teacher t WHERE t.name = :name";
		return em.createQuery(sql, Teacher.class).setParameter("name", name).getResultList();
	}
	
	public List<Teacher> findByGraduation(String graduation){
		String sql = "SELECT t FROM Teacher t WHERE t.graduation.name = :graduation";
		return em.createQuery(sql, Teacher.class).setParameter("graduation", graduation).getResultList();
	}
	
	public String findByNameTeacher(String name){
		String sql = "SELECT t.name FROM Teacher t WHERE t.name = :name";
		return em.createQuery(sql, String.class).setParameter("name", name).getSingleResult();
	}
	
	public List<Teacher> findByRegisterDay(LocalDate date){
		String sql = "SELECT t FROM Teacher t WHERE t.registerDate = :date";
		return em.createQuery(sql, Teacher.class).setParameter("date", date).getResultList();
	}
}

	
