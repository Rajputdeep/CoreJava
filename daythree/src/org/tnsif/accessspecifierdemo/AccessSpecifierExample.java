package org.tnsif.accessspecifierdemo;

public class AccessSpecifierExample {

	private String name;
	
	//Default data member is default it will access only inside the package
	public void display()
	{
		System.out.println("The name is : "+ name);
	}
	
	
	//getter and setter method for private data member
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
