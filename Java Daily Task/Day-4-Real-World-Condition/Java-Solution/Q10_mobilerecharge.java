
import java.util.Scanner;

public class Q10_mobilerecharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter recharge amount: ");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid Recharge Amount");
        } else if (amount >= 599) {
            System.out.println("Recharge Plan: Unlimited Data + Calls");
        } else if (amount >= 399) {
            System.out.println("Recharge Plan: 2GB Data per Day + Calls");
        } else if (amount >= 199) {
            System.out.println("Recharge Plan: 1GB Data per Day + Calls");
        } else {
            System.out.println("Recharge Plan: Basic Plan");
        }

        System.out.println("Recharge Amount: Rs." + amount);

        sc.close();
    }
}