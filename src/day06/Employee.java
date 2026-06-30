package day06;

public class Employee {

	public String name;
	public String id;
	public double salary;
	
	public Employee(String name,String id,double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	
	public void giveSalary() {
		System.out.println(salary);
	}
}
