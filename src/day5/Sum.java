package day5;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		String s=String.valueOf(i);
		System.out.println(s);
		int sum1=0;
		int sum2=0;
		if(s.length()!=4) {
			System.out.println("Invalid number");
		} else {
			int num1=Integer.parseInt(String.valueOf(s.charAt(0)));
			int num2=s.charAt(1);
			int num3=s.charAt(2);
			int num4=s.charAt(3);
			sum1=num1+num2;
			sum2=num3+num4;
			if(sum1==sum2) System.out.println("TRUE");
			else System.out.println("False");
		}
	}
}
