package day5;

public class StrongNumber {
public static void main(String[] args) {
	int num=145;
	int temp=num;
	int sum=0;
	while(temp>0) {
		int digit=temp%10;
		int fact=1;
		for(int i=1;i<=digit;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+digit+" is "+fact);
		sum+=fact;
		temp=temp/10;
	}
	
	System.out.println(sum);
	System.out.println(num==sum?"Strong number":"Not Strong number.");
}
}
