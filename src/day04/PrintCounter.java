package day04;


class Counter {
	public static int count;
	
	public Counter() {
		//count++;
	}
}

public class PrintCounter {

	public static void main(String[] args) {
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
		System.out.println(Counter.count);
	}
}
