package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

//program to demonstrate on arithmetic exception

public class ArithmeticExeptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of x & y");
		int x=s.nextInt();
		int y=s.nextInt();
		try {
		int res=x/y;
		System.out.println(res);

	}
	catch(Exception e)
	{
		System.out.println("Exception handled using catch : "+e);
	}
	finally
	{
		System.out.println("Finally block");
	}
		

}
}
