//find the first occurrence of a element  in an sorted  array
package arrayConcepts;

import java.util.Scanner;

public class LowerBound {
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
	System.out.println("Enter element you want to find its first occurrence=");
	int findEle=sc.nextInt();
	int index=findLowerBound(arr,findEle);
	if(index==-1)
		System.out.println("Element not found");
	else
	System.out.println("First occurrence of "+findEle+" is present at index="+index);
	
	sc.close();
}
static int findLowerBound(int arr[],int se) {
	int li=0,ri=arr.length-1;
	int res=-1;
	while(li<=ri) {
		int mid=(li+ri)/2;
		if(arr[mid]==se) {
			res=mid;
			ri=mid-1;
		}
		else if(arr[mid]<se) {
			li=mid+1;
		}
		else
		{
			ri=mid-1;
		}
	}
	return res;
}
}
//Time complexity : O(log n)
//Space complexity : O(1)