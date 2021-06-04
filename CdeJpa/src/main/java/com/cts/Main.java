package com.cts;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("myApp"); // SessionFactory
		
		EntityManager em=emf.createEntityManager();    // session in hibernate
		
		EntityTransaction transaction=em.getTransaction(); // transaction 
		
		transaction.begin();
		
		Student st1=new Student();
		st1.setName("abc");
		
		Student st2=new Student();
		
		st2.setName("def");
		
		
		Subject sub1=new Subject();
		sub1.setName("java");
		
		Subject sub2=new Subject();
		sub2.setName("MySql");
		
		
		st1.setSubList(Arrays.asList(sub1,sub2));
		
		st2.setSubList(Arrays.asList(sub2));
		
		
		sub1.setStudentList(Arrays.asList(st1));
		
		sub2.setStudentList(Arrays.asList(st1,st2));
		
		em.persist(st1);
		
		em.persist(st2);
			
			
		transaction.commit();
		em.close();
		emf.close();
		
		}

}
