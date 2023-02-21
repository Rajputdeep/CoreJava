package org.tnsif.interfacedemo;

public class MultipleInterfaceExecuter {
	public static void main(String[] args) {
		User obj=new User();
		System.out.println(obj.loanType());
		System.out.print(obj.getInterest());
	}

}
