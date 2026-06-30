package day03;

interface shape{
	public void drow();
}

class Cirle implements shape {
	@Override
	public void drow() {
		System.out.println("Circle drown");
		
	}
}


class Rectangle implements shape{
	 @Override
	public void drow() {
		 System.out.println("Rectangle Drown");
	}
}


class GetShape{
	public static shape getShape(String shape) {
		if(shape.equalsIgnoreCase("rectangle")) return new Rectangle();
		else if(shape.equalsIgnoreCase("CIRCLE")) return new Cirle();
		else throw new IllegalArgumentException("Invalid Shape");
	}
}

public class FactoryMethod2 {
public static void main(String[] args) {
	GetShape.getShape("circle").drow();
}
}
