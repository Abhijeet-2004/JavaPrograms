//Program to implement linear search
package arrayConcepts;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	int size;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array=");
	size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter element into the  array:");
	for(int i=0;i<arr.length;i++) {
		System.out.printf("Value of arr[%d]=",i);
		arr[i]=sc.nextInt();
	}
	int searchElement;
	System.out.println("Enter the element which you want to search=");
	searchElement=sc.nextInt();
	int returnIndex=linearSearch(searchElement,arr);
	if(returnIndex==-1)
		System.out.println("Searched element is not found in the given array");
	else
		System.out.println("Searched element "+searchElement+" is found at index-"+returnIndex);
	sc.close();
}
static int linearSearch(int se,int arr[]) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==se)
			return i;
	}
	return -1;
}
}
//Time complexity : O(n)
//Space complexity : O(1)