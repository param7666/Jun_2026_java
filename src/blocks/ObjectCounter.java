package blocks;

public class ObjectCounter {
	static int count;
	
	public ObjectCounter() {
		count++;
	}
	
	public static void main(String[] args) {
		ObjectCounter bc1=new ObjectCounter();
		ObjectCounter bc2=new ObjectCounter();
		ObjectCounter bc3=new ObjectCounter();
		ObjectCounter bc4=new ObjectCounter();
		System.out.println(count);
		System.out.println(bc1.count);
		
	}
}
