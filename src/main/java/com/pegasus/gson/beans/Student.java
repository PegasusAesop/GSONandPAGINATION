package com.pegasus.gson.beans;

import java.time.LocalDate;

public class Student {

	private String id;
	private String name;
	private Integer age;
	private LocalDate cretime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LocalDate getCretime() {
		return cretime;
	}
	public void setCretime(LocalDate cretime) {
		this.cretime = cretime;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", cretime=" + cretime + "]";
	}
	
	
}
