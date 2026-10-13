
public class Q6_CarObjects {

    static class Car {
        String brand;
        String model;
        double price;

        Car(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: Rs." + price);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Tata", "Nexon", 800000);
        Car c2 = new Car("Hyundai", "i20", 900000);

        c1.display();
        c2.display();
    }
}