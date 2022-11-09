package com.tyss.manytomanybiDTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Teacher {

	@Id
	private int id;
	private String name;
	private long phoneNum;
	
	@ManyToMany(mappedBy = "students")
	private List<Cources> cources;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public List<Cources> getCources() {
		return cources;
	}

	public void setCources(List<Cources> cources) {
		this.cources = cources;
	}
	
	
}
