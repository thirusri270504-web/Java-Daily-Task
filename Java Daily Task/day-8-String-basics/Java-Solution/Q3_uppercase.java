
import java.util.Scanner;

public class Q3_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Uppercase: " + s.toUpperCase());

        sc.close();
    }
}