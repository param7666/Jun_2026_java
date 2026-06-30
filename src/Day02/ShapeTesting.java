package Day02;

import java.util.ArrayList;
import java.util.List;

public class ShapeTesting {
public static void main(String[] args) {
	List<Shape> shapes=List.of(new Rectangle(5),new Circle(5, 6));
	shapes.forEach(s->System.out.printf("%.2f\n",s.area()));
	
}
}
