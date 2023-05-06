//Finding the missing element in the array
package arrayConcepts;
public class Missing {
public static void main(String[] args) {
	int arr[]= {1,3,6,4,5,7,8};
	int arrSize=arr.length;
	int n=arrSize+1;
	int sumOfNaturalNumber=n*(n+1)/2;
	int arrSum=0;
	for(int i:arr) {
		arrSum+=i;
	}
	System.out.println("Missing element is="+(sumOfNaturalNumber-arrSum));
}
}
//Time complexity: O(n)
//space complexity: O(1)
