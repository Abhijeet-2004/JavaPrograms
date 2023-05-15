//Bubble sort technique
package sortingConcept;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int array[]) {
		for(int i=0;i<array.length;i++) {
			boolean flag=true;
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					//swapping
					array[j]=array[j]^array[j+1];
					array[j+1]=array[j]^array[j+1];
					array[j]=array[j]^array[j+1];
					flag=false;
					
				}
			}
			if(flag==true)
				break;
		}
	}
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
	System.out.println("Entered array is="+Arrays.toString(arr));
	
	//Bubble sort call
	bubbleSort(arr);
	
	System.out.println("After sorting array is="+Arrays.toString(arr));
	sc.close();
}
}
//Time complexity : O(n ^2)
//Space complexity : O(1)