package blocks;

class TestBlock{
	int i;
	{
		i=100;
		System.out.println("Block Executed..."+i);
	}
	
	static {
		System.out.println("Static block Executed..");
	}
	
	public TestBlock(String name) {
		System.out.println("Name Constructor executed.."+name+" "+i);
	}
	
	public TestBlock() {
		System.out.println("Defualt Constructor Executed.."+i);
	}
}

public class Demo {

	public static void main(String[] args) {
		TestBlock tb=new TestBlock();
		TestBlock tb2=new TestBlock("Param");
	}
}
