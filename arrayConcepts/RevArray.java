//Reversal of a array
package arrayConcepts;

import java.util.Scanner;

public class RevArray {
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
		
		for(int i=0;i<size/2;i++) {
			arr[i]=arr[i]^arr[size-i-1];
			arr[size-i-1]=arr[i]^arr[size-i-1];
			arr[i]=arr[i]^arr[size-i-1];
		}
		System.out.println("After reversing array is:");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		sc.close();
}
}
//Time complexity: O(n)
//space complexity: O(1)

