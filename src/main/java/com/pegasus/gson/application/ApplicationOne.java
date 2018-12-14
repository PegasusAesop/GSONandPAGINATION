package com.pegasus.gson.application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.pegasus.gson.beans.Student;

public class ApplicationOne {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setId("aesop01");
		s1.setName("aesop");
		s1.setAge(25);
		s1.setCretime(LocalDate.parse("2001-09-08"));
		
		Student s2=new Student();
		s2.setId("aesop02");
		s2.setName("Richard");
		s2.setAge(20);
		s2.setCretime(LocalDate.parse("2007-04-08"));
		
		Student s3=new Student();
		s3.setId("aesop03");
		s3.setName("Pegasus");
		s3.setAge(19);
		s3.setCretime(LocalDate.parse("2012-12-08"));
		
		List<Student> sList=new ArrayList<>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		
		sList.stream().forEach(System.out::println);
		
		
		Gson gson=new Gson();
		String sListJson = gson.toJson(sList);
		System.out.println(sListJson);
	}

}
