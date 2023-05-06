//Rotation of a square matrix
package arrayConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class RotationOfMartrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m,n;
	System.out.println("Enter number of row that present in the square martrix:");
	m=sc.nextInt();//row input
	n=m;
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
	sc.close();
	System.out.println("Before rotation:");
	for(var v:arr) {
		System.out.println(Arrays.toString(v));
	}
	rotation(arr);
	System.out.println("After rotation:");
	for(var v:arr) {
		System.out.println(Arrays.toString(v));
	}
}
public static void rotation(int arr[][]) {
	//Step1: Transpose of  matrix
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr[0].length;j++) {
			//Swapping
			int tem=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=tem;
		}
	}
	
	//step-2: swapping of the  left and right column
	
	for(int i=0;i<arr.length;i++) {
		int lc=0,rc=arr.length-1;
		while(lc<rc) {
			//Swapping
			int tem=arr[i][lc];
			arr[i][lc]=arr[i][rc];
			arr[i][rc]=tem;
			lc++;
			rc--;
		}
	}
}
}
//Time complexity: O(m*n) //here m==n, so ,Time complexity: O(n^2)
//Space complexity: O(1)