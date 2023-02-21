package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		int arr[]= new int[] {11,22,33};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of x & y ");
		int x=s.nextInt();
		int y=s.nextInt();
		
		try {
			int result = x/y;
			System.out.println(result);
		}
		
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception handling using catch :"+e);
	}

}
