package org.tnsif.exceptionhandlingdemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		int arr[]=new int[] {101,23,54};
		
		try {
			
			System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled: "+e);
		}
		finally {
			System.out.println("Finally blocked");
		}

	}

}
