
import java.util.Scanner;

public class Q1_printstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("String: " + s);

        sc.close();
    }
}