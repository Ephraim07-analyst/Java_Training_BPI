package SeatWork6;

public class MyApplication {
	
	public static void main(String[] args) {
	
	Refuelable Wigo = new Car("Wigo");
	Refuelable eight_wheeler = new Truck("Eight Wheeler Truck");
	//Vehicle eight_wheeler = new Truck("Eight Wheeler Truck");
	Vehicle truck = new Truck("Eight Wheeler Truck");
	Vehicle bigtruck = new Truck("Foton", 8);
	//Vehicle smallcar = new Car("Honda", 4);
	

	runCar(Wigo);
	runTruck(eight_wheeler);
	walkTruck(bigtruck);
	truck.destroy();
	
	}
	
	private static void runCar(Refuelable executableProgram) {
		
		executableProgram.refuel();
		
	}
	
	private static void runTruck(Refuelable executableProgram) {
		
		executableProgram.refuel();
		
	}
	
	private static void walkTruck(Vehicle executableProgram) {
		
		executableProgram.startEngine();
		
	}
	
	
	
	//Wigo.refuel();
	//runfuel(Wigo);
	//runStartEngine(Wigo);
	//runDestroy(Wigo);
	//runRefuel(eight_wheeler);
	//runStartEngine(eight_wheeler);
	//runDestroy(eight_wheeler);
	
}
