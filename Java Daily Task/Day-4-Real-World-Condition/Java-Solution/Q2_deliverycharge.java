
import java.util.Scanner;

public class Q2_deliverycharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order amount: ");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid Order Amount");
        } else {
            double charge;

            if (amount >= 2000) {
                charge = 0;
            } else if (amount >= 1000) {
                charge = 50;
            } else {
                charge = 100;
            }

            System.out.println("Order Amount: Rs." + amount);
            System.out.println("Delivery Charge: Rs." + charge);
            System.out.println("Final Amount: Rs." + (amount + charge));
        }

        sc.close();
    }
}