package day5;

public class PerfectNumber {
	
	public static void reverseNumber(int num) {
		String s=String.valueOf(num);
		String rev=new StringBuilder(s).reverse().toString();
		int revNum=Integer.parseInt(rev);
		System.out.println(revNum);
	}
public static void main(String[] args) {
	int n=28;
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			System.out.println("Proper Divisor "+i);
			sum+=i;
		}
	}
	System.out.println(sum);
	System.out.println(n);
	System.out.println(sum==n?"Perfect Number":"Not Perfect Number");
	
	reverseNumber(12345);
	
}
}
