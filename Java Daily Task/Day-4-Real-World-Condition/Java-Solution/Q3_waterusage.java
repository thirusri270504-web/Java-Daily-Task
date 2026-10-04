
import java.util.Scanner;

public class Q3_waterusage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water units used: ");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid Water Units");
        } else {
            int rate;

            if (units <= 100) {
                rate = 5;
            } else if (units <= 200) {
                rate = 7;
            } else {
                rate = 10;
            }

            int bill = units * rate;

            System.out.println("Water Units: " + units);
            System.out.println("Rate per Unit: Rs." + rate);
            System.out.println("Total Water Bill: Rs." + bill);
        }

        sc.close();
    }
}