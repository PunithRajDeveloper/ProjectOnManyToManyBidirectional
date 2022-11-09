package com.tyss.manytomanyBi.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.manytomanybiDTO.Cources;
import com.tyss.manytomanybiDTO.Teacher;

public class Controller {
public static void main(String[] args) {
	
	Teacher students=new Teacher();
	students.setId(1);
	students.setName("Ramesh");
	students.setPhoneNum(754643464);
	
	Teacher students2=new Teacher();
	students2.setId(2);
	students2.setName("Harish");
	students2.setPhoneNum(854643464);
	
	Teacher students3=new Teacher();
	students3.setId(3);
	students3.setName("Suresh");
	students3.setPhoneNum(654643464);
	
	Teacher students4=new Teacher();
	students4.setId(4);
	students4.setName("SaiPrakash");
	students4.setPhoneNum(954643464);
	
	
	Cources  cources=new Cources();
	cources.setId(1);;
	cources.setName("Artificial_Inteligebce");
	
	Cources  cources2=new Cources();
	cources2.setId(2);;
	cources2.setName("Machine_learning");
	
	Cources  cources3=new Cources();
	cources3.setId(3);;
	cources3.setName("Data_Engineer");
	
	Cources  cources4=new Cources();
	cources4.setId(4);;
	cources4.setName("Affileated_market");
	
	
	
	List<Cources> l1=new ArrayList<Cources>();
	l1.add(cources);
	l1.add(cources2);
	students.setCources(l1);
	
	List<Cources> l2=new ArrayList<Cources>();
	l2.add(cources3);
	l2.add(cources4);
	students2.setCources(l2);
	
	List<Cources> l3=new ArrayList<Cources>();
	l3.add(cources4);
	l3.add(cources3);
	students3.setCources(l3);
	
	List<Cources> l4=new ArrayList<Cources>();
	l4.add(cources);
	l4.add(cources4);
	students4.setCources(l4);
	
	
	List<Teacher> s1=new ArrayList<Teacher>();
	s1.add(students4);
	s1.add(students);
	cources.setStudents(s1);
	
	List<Teacher> s2=new ArrayList<Teacher>();
	s2.add(students);
	cources2.setStudents(s2);
	
	List<Teacher> s4=new ArrayList<Teacher>();
	s4.add(students2);
	s4.add(students3);
	cources3.setStudents(s4);
	
	List<Teacher> s3=new ArrayList<Teacher>();
	s3.add(students2);
	s3.add(students4);
	cources.setStudents(s3);
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	entityTransaction.begin();
	
	entityManager.persist(cources);
	entityManager.persist(cources2);
	entityManager.persist(cources3);
	entityManager.persist(cources4);
	
	entityManager.persist(students);
	entityManager.persist(students2);
	entityManager.persist(students3);
	entityManager.persist(students4);
	
	
	
	entityTransaction.commit();
	
	
	
	
	
	
	
	
	
	
}
}
