package ph.com.bpi.helloworld;


public class Car {
  
    private String brand;
    private String model;
    private int year;
    private String color;

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unpainted";
    }

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) {
     
        if (year < 1886) { 
            throw new IllegalArgumentException("Year must be 1886 or later.");
        }
        this.year = year;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("  Brand: " + brand);
        System.out.println("  Model: " + model);
        System.out.println("  Year : " + year);
        System.out.println("  Color: " + color);
        System.out.println("------------------------------");
    }

    public void startEngine() {
        System.out.println(brand + " " + model + " (" + year + ") engine started!");
    }

    public static void main(String[] args) {
    
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Vios");
        car1.setYear(2020);
        car1.setColor("Silver");

        Car car2 = new Car("Honda", "Civic", 2022, "Red");

        car1.displayDetails();
        car1.startEngine();

        car2.displayDetails();
        car2.startEngine();

        System.out.println("car1 brand via getter: " + car1.getBrand());
        System.out.println("car2 color via getter: " + car2.getColor());
    }
}



