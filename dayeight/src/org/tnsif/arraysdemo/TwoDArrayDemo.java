package org.tnsif.arraysdemo;
import java.util.Scanner;
public class TwoDArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr[][]=new int[n] [m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++) {
				arr[i][j] = s.nextInt();
				System.out.println(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println(arr[0][1]);
			
		
//		int[][]a= {{10,20,30},{40,50,60}};
//		System.out.println(a[0][0]);

	}

}

//Jaged array


