package OOPs.Polymorphism.MethodOverriding;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}
