package CommandLineExamples;

import java.util.Arrays;

public class FIndMinAndMax {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	
	System.out.println(Arrays.stream(arr).min().getAsInt());
	System.out.println(Arrays.stream(arr).max().getAsInt());
}
}
