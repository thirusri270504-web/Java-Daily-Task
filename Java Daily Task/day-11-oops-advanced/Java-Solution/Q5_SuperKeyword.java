
public class Q5_SuperKeyword {

    static class Vehicle {
        String brand = "Tata";
    }

    static class Car extends Vehicle {
        String model = "Nexon";

        void display() {
            System.out.println("Brand: " + super.brand);
            System.out.println("Model: " + model);
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
