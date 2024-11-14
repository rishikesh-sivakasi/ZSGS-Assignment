package Inheritance;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract String getFuelType();

    public void displayInfo() {
        System.out.println("Vehicle Info: " + year + " " + make + " " + model);
        System.out.println("Fuel Type: " + getFuelType());
    }
}

class Car extends Vehicle {
    private int numDoors;
    private String fuelType;

    public Car(String make, String model, int year, int numDoors, String fuelType) {
        super(make, model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2021, 4, "Gasoline");
        System.out.println("Car Details:");
        car.displayInfo();
    }
}