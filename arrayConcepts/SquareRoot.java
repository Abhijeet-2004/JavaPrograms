/* Find the square root of a number , if number having perfect square root return perfect square root value 
 * otherwise return floor value of square root
 */
package arrayConcepts;

import java.util.Scanner;

public class SquareRoot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.print("Enter a number:");
	num=sc.nextInt();
	int res=findSquareRoot(num);
	System.out.println("Square root of "+num+" is(if number does not having perfect square root floor value given)="+res);
	sc.close();
}
static int findSquareRoot(int num) {
	int low=1,high=num,res=1;
	//Modified binary search concept
	while(low<=high) {
		int mid=(low+high)/2;
		long val=mid*mid;
		if(val==num) {
			//perfect square root
			return mid;
		}
		else if(val>num)
		{
			high=mid-1;
		}
		else
		{
			res=mid;
			low=mid+1;
		}
		
	}
	return res;
}
}
//Time complexity : O(log n)
//Space complexity : O(1)