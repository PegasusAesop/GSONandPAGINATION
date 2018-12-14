package com.pegasus.gson.beans;

import java.time.LocalDate;

import com.google.gson.Gson;

public class TestBean {

	
	public static void main(String[] args) {
		Student s=new Student();
		s.setId("aesop01");
		s.setName("aesop");
		s.setAge(25);
		s.setCretime(LocalDate.parse("2001-09-08"));
		
		Gson gson=new Gson();
		String sStr=gson.toJson(s);
		System.out.println(sStr);
		
	}
}
