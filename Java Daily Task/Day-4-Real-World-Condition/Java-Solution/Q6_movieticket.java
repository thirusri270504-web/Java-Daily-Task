
import java.util.Scanner;

public class Q6_movieticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer age: ");
        int age = sc.nextInt();

        System.out.print("Enter show type (NORMAL/IMAX): ");
        String show = sc.next().toUpperCase();

        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (!show.equals("NORMAL") && !show.equals("IMAX")) {
            System.out.println("Invalid Show Type");
        } else {
            int price;

            if (age < 12) {
                price = 120;
                System.out.println("Child Ticket");
            } else if (age <= 59) {
                price = 200;
                System.out.println("Adult Ticket");
            } else {
                price = 150;
                System.out.println("Senior Citizen Ticket");
            }

            if (show.equals("IMAX")) {
                price += 100;
            }

            System.out.println("Show Type: " + show);
            System.out.println("Final Ticket Price: Rs." + price);
        }

        sc.close();
    }
}