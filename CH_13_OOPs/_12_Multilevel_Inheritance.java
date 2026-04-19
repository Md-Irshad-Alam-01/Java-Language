package CH_13_OOPs;

// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

// First derived class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives on the road.");
    }
}

// Second derived class (Child of Car)
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric Car is charging.");
    }
}

public class _12_Multilevel_Inheritance {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();
        tesla.drive();
        tesla.charge();
    }
}