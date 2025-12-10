package SeatWork6;

public class Truck extends Vehicle implements Refuelable{

	
	public Truck(String name) {
		this.setName(name);
	}
	
	public Truck (String brand, int numberOfWheels) {
		this.setBrand(brand);
		this.setNumber(numberOfWheels);
	}
	
	@Override
	public void refuel() {
		String message = "Refueling Diesel to " + getName() + " ....";
		System.out.println(message);
		
	}

	@Override
	void startEngine() {
		String message =  getBrand() + " Starting Engine with " + getNumber() + " Wheels";
		System.out.println(message);
	}

	@Override
	void destroy() {
		String message =  getName() + " is overheating!!! .... Boom!!! Engine Destroyed";
		System.out.println(message);
		
	}

}
