package org.tnsif.FinalKeyword;
//program to demonstrate on final variable
public class FinalVariable {
	
	final static int x=15;
	private static void print()
	{
		//We can't change the value of x here
		System.out.println("The value of x is :"+x);
	}
	public static void main(String args[])
	{
		FinalVariable.print();
	}

}