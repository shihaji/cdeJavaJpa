package com.cts;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "my_seq")
	@SequenceGenerator(name = "my_seq",initialValue = 100)
	private int rollNo;
	
	private String name;
	
	//@OneToMany(cascade = CascadeType.ALL,mappedBy = "student",fetch = FetchType.EAGER)
	
	 @ManyToMany(cascade = CascadeType.ALL,mappedBy = "studentList")
	 private List<Subject> subList;
	
	
	
	
	//@OneToOne(cascade = CascadeType.ALL,mappedBy = "student")
	//@JoinColumn(name="sub_id")
	//private Subject subject;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subject> getSubList() {
		return subList;
	}

	public void setSubList(List<Subject> subList) {
		this.subList = subList;
	}

	/*
	 * public Subject getSubject() { return subject; }
	 * 
	 * public void setSubject(Subject subject) { this.subject = subject; }
	 */
	
	

}
