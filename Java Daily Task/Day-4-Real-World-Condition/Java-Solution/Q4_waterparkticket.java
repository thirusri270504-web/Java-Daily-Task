
import java.util.Scanner;

public class Q4_waterparkticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (age < 5) {
            System.out.println("Ticket Price: Free");
        } else if (age <= 12) {
            System.out.println("Ticket Price: Rs.100");
        } else if (age <= 59) {
            System.out.println("Ticket Price: Rs.250");
        } else {
            System.out.println("Ticket Price: Rs.150");
        }

        sc.close();
    }
}