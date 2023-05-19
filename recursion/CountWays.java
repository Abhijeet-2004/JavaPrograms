//Count the number of ways to cover a stair
package recursion;

import java.util.Scanner;

public class CountWays {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.print("Enter the number of stair:");
	n=sc.nextInt();
	sc.close();
	//Function calling
	int result=numberOfWays(n+1);
	System.out.println("Number of ways="+result);
}
public static int numberOfWays(int n) {
	if(n==0||n==1)
		return n;
	else
		return numberOfWays(n-1)+numberOfWays(n-2);
}
}
//Time complexity: O(2^n)
//Space complexity: O(n)