package sortingConcept;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				//Swapping
				arr[minIndex]=arr[i]^arr[minIndex];
				arr[i]=arr[i]^arr[minIndex];
				arr[minIndex]=arr[i]^arr[minIndex];
			}
		}
	}
	public static void main(String[] args) {
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
		
		//Selection sort call
		selectionSort(arr);
		
		System.out.println("Sorting of array using selection sort="+Arrays.toString(arr));
		sc.close();
	}
}
//Time complexity : O(n^2)
//Space complexity : O(1)