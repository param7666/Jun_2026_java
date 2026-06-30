package CommandLineExamples;

import java.util.Arrays;

public class ReverseTheOrder {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int rev[]=new int[arr.length];
		
		for(int i=arr.length-1;i>0;i--) {
			rev[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rev));
		
		// this is wrong code.....
	}
}
