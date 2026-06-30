package day03;

public class Employee {
	
	private String name;
//	private int id;
	private int id;
	
	public Employee(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(this==null || getClass()!=obj) return false;
		Employee p=(Employee)obj;
		return id==p.id && name.equals(p.name);
	}
	
	@Override
	public int hashCode() {
		return id+name.hashCode();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public void display() {
		System.out.println(name+" "+id);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("Param", 101);
		Employee e2=new Employee("Param", 101);
		Employee e3=new Employee("Rahul", 103);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
		System.out.println(e1.hashCode());

		System.out.println(e2.hashCode());

		System.out.println(e3.hashCode());
		
		// print runtime class name
		System.out.println(e1.getClass());
		try {
		Employee e4=(Employee)e1.clone();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("e1 display");
		e1.display();
		
		System.out.println("e2 display");
		e2.display();
	}
}
