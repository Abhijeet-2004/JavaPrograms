//Calculate a^b
package recursion;

import java.util.Scanner;

public class FindPower{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in );
	int a,b;
	System.out.println("Enter the value of 'a' and 'b':");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.printf("%d^%d=%d",a,b,power(a,b));
	sc.close();
	
}
public static long power(int a,int b) {
	long result;
	long finalResult;
	if(b==1)//base case condition
		return a;
	else //recursive case condition
	{
		result=power(a,b/2);
		finalResult=result*result;
	}
	
	if(b%2==0) //if b value is even
		return finalResult;
	else //if b value is odd
		return a*finalResult;
}
}
//Time complexity : O(log b)