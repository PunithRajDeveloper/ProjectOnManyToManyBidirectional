package com.tyss.manytomanybiDTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Cources {
	
	@Id
private int id;
private String name;

@ManyToMany
@JoinTable(joinColumns = {@JoinColumn},inverseJoinColumns = {@JoinColumn(name = "id")})
private List<Teacher> students;

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

public List<Teacher> getStudents() {
	return students;
}

public void setStudents(List<Teacher> students) {
	this.students = students;
}


}
