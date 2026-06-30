package day5;

public class ArmStrong {
public static void main(String[] args) {
	//Write a program to check Armstrong number (e.g., 153 → 1³+5³+3³=153)
	int n=9474;
	int nl=String.valueOf(n).length();
	System.out.println("Digit length "+nl);
	int temp=n;
	int sum=0;
	
	while(temp>0) {
		int digit=temp%10;
		sum+=(int)Math.pow(digit, nl);
		temp=temp/10;
	}
	System.out.println("Sum: "+sum);
	System.out.println("Orignal N: "+n);
	System.out.println(n==sum?"Palindrome":"Not palindrome.");
	
}
}
