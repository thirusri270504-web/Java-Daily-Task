
public class Q3_HierarchicalInheritance {

    static class Vehicle {
        void start() {
            System.out.println("Vehicle is starting");
        }
    }

    static class Car extends Vehicle {
        void drive() {
            System.out.println("Car is driving");
        }
    }

    static class Bike extends Vehicle {
        void ride() {
            System.out.println("Bike is riding");
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        c.drive();

        b.start();
        b.ride();
    }
}
