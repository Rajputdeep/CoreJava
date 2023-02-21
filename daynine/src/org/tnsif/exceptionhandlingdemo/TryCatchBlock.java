package org.tnsif.exceptionhandlingdemo;

public class TryCatchBlock {

	private static final int[] myIntarray = null;
	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		try {
		int[] myIntArray = new int[] {1,2,3};
		print(myIntarray);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array doesn't have fourth element");
		}
		System.out.println("Third Line");

	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
		//System.out.println("Fourth element successfully displayed");
	}

}
