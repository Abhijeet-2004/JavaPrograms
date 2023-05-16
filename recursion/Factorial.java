//Program for find the factorial of a number using recursion 
package recursion;

import java.util.Scanner;

public class Factorial {
public static int fact(int num) {
	if(num==0||num==1)//base case condition
		return 1;
	else
		return num*fact(num-1);//recursive call
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int number;
	System.out.print("Enter a number:");
	number=sc.nextInt();
	System.out.println("factorial of given number is="+fact(number));
	sc.close();
}
}
//Time complexity : O(n)
//Space complexity : O(n)