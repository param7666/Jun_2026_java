package day06;

public class Manager extends Employee{

	public double bonus;
	
	public Manager(String name,String id,double salary,double bonus) {
		super(name,id,salary);
		this.bonus=bonus;
	}
	
	public void giveSalary() {
		System.out.println(salary+bonus);
	}
}
