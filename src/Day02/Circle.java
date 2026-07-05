package Day02;

public class Circle extends Shape{

	double h;
	double w;
	
	public Circle(double h,double w) {
		this.h=h;
		this.w=w;
	}
	
	@Override
	double area() {
		return w*h;
		System.err.println("New Printing Statement");
	}
}
