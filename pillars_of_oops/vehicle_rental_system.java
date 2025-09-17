// Abstract Vehicle class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: " + rentalRate);
    }

    public abstract double calculateRentalCost(int days);
}

// Insurable interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car subclass
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1000;  // Fixed insurance cost for Car
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance: Fixed at 1000";
    }
}

// Bike subclass
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;  // Fixed insurance cost for Bike
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance: Fixed at 500";
    }
}

// Truck subclass
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 2000;  // Fixed insurance cost for Truck
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance: Fixed at 2000";
    }
}


import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("CAR123", 1500);
        Bike bike = new Bike("BIKE456", 500);
        Truck truck = new Truck("TRUCK789", 2500);

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();
            System.out.println("Rental Cost for 5 days: " + v.calculateRentalCost(5));

            if (v instanceof Insurable) {
                System.out.println(((Insurable) v).getInsuranceDetails());
                System.out.println("Insurance Cost: " + ((Insurable) v).calculateInsurance());
            }

            System.out.println("------------------------------");
        }
    }
}
