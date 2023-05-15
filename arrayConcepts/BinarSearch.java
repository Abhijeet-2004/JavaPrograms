//Program to implement binary search in an array
package arrayConcepts;

import java.util.Scanner;

public class BinarSearch {
public static void main(String[] args) {
	int size;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array=");
	size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter element into the  array(in asending order):");
	for(int i=0;i<arr.length;i++) {
		System.out.printf("Value of arr[%d]=",i);
		arr[i]=sc.nextInt();
	}
	int searchElement;
	System.out.println("Enter the element which you want to search=");
	searchElement=sc.nextInt();
	int returnIndex=binarySearch(searchElement,arr);
	if(returnIndex==-1)
		System.out.println("Searched element "+searchElement+ " is not found in the given array");
	else
		System.out.println("Searched element "+searchElement+" is found at index-"+returnIndex);
	sc.close();
	
}
static int binarySearch(int se,int arr[]) {
	int li=0,ri=arr.length-1;
	while(li<=ri) {
		int mid=(li+ri)/2;
		if(arr[mid]==se)
		{
			return mid;
		}
		else if(arr[mid]<se) {
			li=mid+1;
		}
		else 
		{
			ri=mid-1;
		}
	}
	return -1;
}
}
//Time complexity : O(log n)
//Space complexity : O(1)