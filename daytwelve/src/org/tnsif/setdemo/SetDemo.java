package org.tnsif.setdemo;

import java.util.HashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Object>obj1=new HashSet<>();
		obj1.add(11);
		obj1.add("Deepal");
		obj1.add(85.52f);
		System.out.println("Set1 Elemrnts are :"+obj1);
		
		Set<Object>obj2=new LinkedHashSet<>();
		obj2.add(11);
		obj2.add("Deepal");
		obj2.add(85.52f);
		
		System.out.println("Set2 Elements are "+obj2);
		
		

	}

}
