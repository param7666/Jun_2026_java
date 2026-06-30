package day5;

public class Case1 {
public static void main(String[] args) {
	int i=5;
	switch(i) {
	case 0:
		System.out.println("case 0 executed");
		break;
	case 1:
		System.out.println("case 1 executed.");
		break;
	default :
		System.out.println("Default case Executed...");
		break;
		
	}
	
	String day="Sunday";
	
	switch(day) {
	case "Monday":
		System.out.println("Today is monday");
		break;
	case "Friday":
		System.out.println("Today is friday");
		break;
	case "Sunday":
		System.out.println("Today is sunday");
		break;
		
	}
}
}
