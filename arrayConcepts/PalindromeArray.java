//Program to check entered array is a palindromic array or not
package arrayConcepts;

import java.util.Scanner;

public class PalindromeArray {
public static void main(String[] args) {
	int size;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("enter element into array:");
	for(int i=0;i<size;i++) {
		System.out.println("enter value of arr["+i+"]=");
		arr[i]=sc.nextInt();
	}
	Boolean flag=true;
	for(int i=0;i<size/2;i++) {
		if(arr[i]!=arr[size-i-1]) {
			System.out.println("entered array is not a palindromic array");
			flag=false;
			break;
		}
	}
	if(flag==true)
		System.out.println("Entered array is a palindromic array");
	sc.close();
}
}
//Time complexity: O(n)
//space complexity: O(1)
