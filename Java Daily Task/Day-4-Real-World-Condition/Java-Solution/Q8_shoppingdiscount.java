
import java.util.Scanner;

public class Q8_shoppingdiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter shopping amount: ");
        double amount = sc.nextDouble();

        System.out.println("1. Premium");
        System.out.println("2. Regular");
        System.out.println("3. Non-Member");
        System.out.print("Select membership type: ");
        int type = sc.nextInt();

        if (amount < 0) {
            System.out.println("Invalid Shopping Amount");
        } else if (type < 1 || type > 3) {
            System.out.println("Invalid Membership Type");
        } else {
            double rate;

            if (type == 1) {
                rate = (amount >= 5000) ? 25 : 20;
            } else if (type == 2) {
                rate = (amount >= 5000) ? 15 : 10;
            } else {
                rate = (amount >= 5000) ? 5 : 0;
            }

            double discount = amount * rate / 100;
            double finalAmount = amount - discount;

            System.out.println("Shopping Amount: Rs." + amount);
            System.out.println("Discount Rate: " + rate + "%");
            System.out.println("Discount Amount: Rs." + discount);
            System.out.println("Final Amount: Rs." + finalAmount);
        }

        sc.close();
    }
}