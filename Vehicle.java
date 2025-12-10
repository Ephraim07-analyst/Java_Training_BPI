package SeatWork6;

public abstract class Vehicle {
	
	private String name;
	private boolean IsEmpty = false;
	private int numberOfWheels;
	private String brand;
	
	
	public Vehicle(){
	}

	public Vehicle(String name) {
		this.name = name;
	}
	
	public Vehicle(String brand, int numberOfWheels) {
		this.setBrand(brand);
		this.setNumber(numberOfWheels);
	}
	
	abstract void refuel(); 
	abstract void destroy();
	abstract void startEngine();
		
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setIsEmpty(boolean IsEmpty) {
		this.IsEmpty = IsEmpty;
	}
	
	public boolean getIsEmpty() {
		return IsEmpty;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setNumber(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getNumber() {
		return numberOfWheels;
	}
}
