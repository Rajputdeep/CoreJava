package org.tnsif.exceptionhandlingdemo;

//program to demonstrate throw & throws Keyword
public class ThrowKeywordDemo {
	
	//Throws is used to declare an exception
	
	public static void donate(int age,int weight) throws Exception
	{
		if(age>18 && weight>50)
			System.out.println("Eligible to donate blood");
		
		else
			throw new Exception ("Not Eligible");
			
		
	}

	public static void main(String[] args) {
		try
		{
			donate(20,52);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
