package varargs;

public class Sum {

	public void sum(int... num) {
		int sum=0;
		for(int n:num) {
			sum+=n;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new Sum().sum(1,2,3,4,5);
	}
}
