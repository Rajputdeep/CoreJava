package org.tnsif.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSetExecuter {
	
	public static void addStudent(Set<Student>obj)
	{
		Student student1=new Student(10, "Sahil", 1.56f);
		Student student2=new Student(10, "Sahil", 2.56f);
		Student student3=new Student(10, "Sahil", 3.56f);
		
		obj.add(student1);
		obj.add(student2);
		obj.add(student3);
		
		
	}

	public static void main(String[] args) {
		Set<Student>obj=new LinkedHashSet<>();
		addStudent(obj);
		System.out.println(obj);

	}

}
