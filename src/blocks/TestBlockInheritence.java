package blocks;

class Father {
	
	int i;
	
	static {
		System.out.println("Block Executed.."+Father.class);
	}
	
	{
		i=100;
		System.out.println("Father non static block Executed..."+i);
		
	}
}


	class Son extends Father {
		int i;
		
		static {
			System.out.println("Son static blockk Executed..");
		}
			
		{
			i=200;
			System.out.println("Non static block Executed of Son class "+i);
		}
	}
public class TestBlockInheritence {

	public static void main(String[] args) {
		Son s1=new Son();
		Father f1=new Father();
	}
}
