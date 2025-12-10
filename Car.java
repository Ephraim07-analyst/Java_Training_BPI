package SeatWork6;

public class Car extends Vehicle implements Refuelable{
	
	public Car(String name) {
		this.setName(name);
	}
	
	@Override
	public void refuel() {
		String message = "Refueling Diesel to " + getName() + " ....";
		System.out.println(message);
		
	}

	@Override
	void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	void startEngine() {
		String message = getBrand() + " is starting";
		System.out.println(message);
	}
}