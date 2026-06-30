package day03;

interface Vehicle {
	public void start();
}

class Car implements Vehicle {
	@Override
	public void start() {
		System.out.println("Car started...");
	}
}

class Bike implements Vehicle{
	
	@Override
	public void start() {
		System.out.println("Bike Started....");
		
	}
}

class DecideVehicle{
	
	public static Vehicle getVehicle(String vehicleName) throws Exception{
		if(vehicleName.isBlank() || vehicleName.isEmpty()) throw new IllegalArgumentException("Invalid Vehicle");
		if(vehicleName.equalsIgnoreCase("car")) return new Car();
		if(vehicleName.equalsIgnoreCase("bike")) return new Bike();
		else return null;
	}
}

public class Driver {
public static void main(String[] args) {
	try {
	DecideVehicle.getVehicle("car").start();
	DecideVehicle.getVehicle("bike").start();
	//DecideVehicle.getVehicle(null).start();
	DecideVehicle.getVehicle("abcd").start();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
