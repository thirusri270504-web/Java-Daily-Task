
import java.util.Scanner;

public class Q5_simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();

        System.out.println("1. Student");
        System.out.println("2. General");
        System.out.print("Select customer type: ");
        int type = sc.nextInt();

        if (principal < 0 || time < 0) {
            System.out.println("Invalid Input");
        } else if (type != 1 && type != 2) {
            System.out.println("Invalid Customer Type");
        } else {
            double rate = (type == 1) ? 5 : 7;

            double interest = (principal * rate * time) / 100;
            double total = principal + interest;

            System.out.println("Interest Rate: " + rate + "%");
            System.out.println("Simple Interest: Rs." + interest);
            System.out.println("Total Amount: Rs." + total);
        }

        sc.close();
    }
}