package com.alpdex.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.alpdex.entity.Student;

public class StudentDao {

	private EntityManager em;

	public StudentDao(EntityManager em) {
		this.em = em;
	}
	
	public void insert(Student student) {
		this.em.persist(student);
	}
	
	@SuppressWarnings("unchecked")
	public List<Student> findAll(){
		return this.em.createNamedQuery("Student.findAll").getResultList();
	}
	
	public List<Student> findByName(String name) {
		String sql = "SELECT s FROM Student s WHERE s.name = :name";
		return this.em.createQuery(sql, Student.class).setParameter("name", name).getResultList();
	}
	
}
