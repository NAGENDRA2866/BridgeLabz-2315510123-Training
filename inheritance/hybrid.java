// 1

// Superclass
class Person {
    String name;
    String id;

    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass 1
class Chef extends Person implements Worker {
    Chef(String name, String id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes.");
    }
}

// Subclass 2
class Waiter extends Person implements Worker {
    Waiter(String name, String id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("John", "C001");
        Waiter waiter = new Waiter("Jane", "W001");

        chef.performDuties();
        waiter.performDuties();
    }
}


//2

// Superclass
class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// Subclass 1
class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " is charging.");
    }
}

// Subclass 2
class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Toyota Corolla");

        ev.charge();
        pv.refuel();
    }
}

