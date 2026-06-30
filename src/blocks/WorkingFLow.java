package blocks;

class Param {
	int i;
	
	static {
		System.out.println("Static block Executed...");
	}
	
	{
		i=100;
		System.out.println("Non static block Executed.."+i);
	}
	
	public Param() {
		System.out.println("Defual constructor Executed.."+i);
	}
	
	public Param(int i) {
		this.i=i;
		System.out.println("User defined constructor Executed.."+i);
	}
	
	public static void display() {
		System.out.println("Static display executed....");
	}
	
	public void m2() {
		System.out.println("Non static m2() executed...");
	}
}


public class WorkingFLow {
public static void main(String[] args) {
	//Param p=new Param();
	Param p2=new Param(200);
	//p2.display();
	p2.m2();
	p2.display();
}
}
