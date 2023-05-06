//Print the duplicate element present in the array
package arrayConcepts;

public class DuplicateElement {
	public static void main(String[] args) {
		int arr[]= {1,3,2,4,3,6,8,6};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate element found is:"+arr[i]);
				}
			}
		}
	}
}
