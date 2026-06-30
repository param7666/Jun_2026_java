package Day02;

public class Duck implements Flybble, Swimable{

	@Override
	public void fly() {
		System.out.println("Duck is flying ");
	}
	
	@Override
	public void swim() {
		System.out.println("Duck is Swiming");
	}
}
