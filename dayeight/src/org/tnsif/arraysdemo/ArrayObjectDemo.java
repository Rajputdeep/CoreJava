package org.tnsif.arraysdemo;
import java.util.Scanner;
public class ArrayObjectDemo {

	public static void main(String[] args) {
		Student arr[];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num of Elements " + "In the array");
		int n=s.nextInt();
		arr=new Student [n];
		
		//for(int i=0, j=0, k=0; i<n, j<n, k<n; i++, j++, k++)
		
		int i = 0;
		while(i<n)
		{
			arr[i] = new Student(s.nextInt(),s.next(),s.nextFloat());
			i++;
		}
		
		for(int j=0; j<n; j++)
		{
			System.out.println(arr[j].getRollno()+ " "+arr[j].getName()+" "+arr[j].getPercentage());
			
		}
		
			

	}

}