
import java.util.Scanner;

public class Q9_parkingfee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parking hours: ");
        double hours = sc.nextDouble();

        if (hours < 0) {
            System.out.println("Invalid Parking Hours");
        } else {
            double fee;

            if (hours <= 2) {
                fee = hours * 30;
            } else if (hours <= 5) {
                fee = (2 * 30) + ((hours - 2) * 20);
            } else {
                fee = (2 * 30) + (3 * 20)
                      + ((hours - 5) * 10);
            }

            System.out.println("Parking Hours: " + hours);
            System.out.println("Total Parking Fee: Rs." + fee);
        }

        sc.close();
    }
}