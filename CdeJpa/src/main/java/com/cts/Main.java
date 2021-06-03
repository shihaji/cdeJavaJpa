package com.cts;

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
		
		Query query=em.createQuery("select e from Employee e where e.name=:name");
		query.setParameter("name", "mno");
			
		
		Employee emp=(Employee) query.getSingleResult();
		
		System.out.println(emp.getName());
		
		transaction.commit();
		
		

	}

}
