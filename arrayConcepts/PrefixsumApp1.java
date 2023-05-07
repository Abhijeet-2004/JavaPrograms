//In matrix ,find the sum of the element that present in two coordinates  makes  rectangle .using Brute force approach
package arrayConcepts;

import java.util.Scanner;

public class PrefixsumApp1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m,n;
	System.out.println("Enter number of row and column that present in the  martrix:");
	m=sc.nextInt();//row input
	n=sc.nextInt();//column input
	int arr[][]=new int[m][n];
	System.out.println("Enter values into array");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[0].length;j++)
		{
		System.out.println("Enter value arr["+i+"]["+j+"]=");
		arr[i][j]=sc.nextInt();
		}
	}
	int r1,c1,r2,c2;
	System.out.println("Enter r1 coordinate:");
	r1=sc.nextInt();
	System.out.println("Enter c1 coordinate:");
	c1=sc.nextInt();
	System.out.println("Enter r2 coordinate:");
	r2=sc.nextInt();
	System.out.println("Enter c2 coordinate:");
	c2=sc.nextInt();
	System.out.println("Sum of the element that present in given square is: "+sumMatrix(arr,r1,c1,r2,c2));
	sc.close();
	
}
	static int sumMatrix(int arr[][],int r1,int c1,int r2,int c2) {
		int sum=0;
		for(int i=r1;i<=r2;i++) {
			for(int j=c1;j<=c2;j++) {
				sum+=arr[i][j];
			}
		}
		return sum;
	}
}
//Time complexity :O(m*n)
//Space complexity :O(1)
