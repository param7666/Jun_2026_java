package day06;



public class Company {

	public static void main(String[] args) {
		Manager m=new Manager("Param","M001",25000,5000);
		m.giveSalary();
		
		Employee e=new Employee("Sundar","M001",25000);
		e.giveSalary();
	}
}
