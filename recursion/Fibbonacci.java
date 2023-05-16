//Find the nth term in the fibbonaci series 
package recursion;

import java.util.Scanner;

public class Fibbonacci {
	public static int fibo(int n) {
		int res;
		if(n==1||n==0)
			return n;
		else
			res=fibo(n-1)+fibo(n-2);
		return res;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.print("Enter the n value of fibbonci series to find nth term=");
	num=sc.nextInt();
	sc.close();
	
	//fibo function call
	int result=fibo(num);
	System.out.println(num+"th term in the fibbonacci series is="+result);
}
}
//Time complexity: O(2^n)
//Space complexity: O(n)