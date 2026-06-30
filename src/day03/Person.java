package day03;

import java.util.List;

public class Person {
	String name="param";
	String lovedOn="NoOne";
	
	@Override
	public String toString() {
		return "Name "+name+" who Loves You "+lovedOn;
	}
	
	public void checkStringDiff(String s1,String s2) {
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

public static void main(String[] args) {
	Person p=new Person();
	Person p2=new Person();
	System.out.println(p==p2);
	List<Integer> l=List.of(1,2,3,4);
	List<Integer> l2=List.of(1,2,3,4);	
	System.out.println(p.equals(p2));
	System.out.println(l.equals(l2));
	System.out.println(l==l2);
	System.out.println(p);
	System.out.println("Check String ");
	p.checkStringDiff("Param", "Param");
	p.checkStringDiff("Sundar", "Param");
	p.checkStringDiff(p.lovedOn, p.name);
}
}
