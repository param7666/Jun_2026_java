package Day02;

public class Rectangle extends Shape{

	double r;
	
	public Rectangle(double r) {
	this.r=r;
	}
	@Override
	double area() {
		
		return Math.PI *r*r;
	}
}
