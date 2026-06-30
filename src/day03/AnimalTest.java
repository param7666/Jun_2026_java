package day03;

class Animal {
	public Animal getObject() {
		System.out.println("Animal Object returned.");
		return new Animal();
	}
}

class Dog extends Animal{
	@Override
	public Dog getObject() {
		System.out.println("Dog object returned....");
		return new Dog();
	}
}

public class AnimalTest {
public static void main(String[] args) {
	Animal a=new Animal().getObject();
	Dog d=new Dog().getObject();
}
}
