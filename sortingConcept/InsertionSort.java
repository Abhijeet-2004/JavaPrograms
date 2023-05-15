//Insertion sort implementation
package sortingConcept;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0&&(arr[j-1]>arr[j]);j--) {
				//Swapping
				arr[j]=arr[j]^arr[j-1];
				arr[j-1]=arr[j]^arr[j-1];
				arr[j]=arr[j]^arr[j-1];
			}
		}
	}
		
	public static void main(String[] args) 
	{
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array=");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element into the  array:");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("Value of arr[%d]=",i);
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered array is="+Arrays.toString(arr));
		
		//Insertion sort call
		insertionSort(arr);
		
		System.out.println("Sorting of array using insertion sort="+Arrays.toString(arr));
		sc.close();
	
	}
}
//Time complexity : O(n^2)
//Space complexity : O(1)