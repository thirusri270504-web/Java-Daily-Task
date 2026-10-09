
import java.util.Scanner;

public class Q4_lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Lowercase: " + s.toLowerCase());

        sc.close();
    }
}