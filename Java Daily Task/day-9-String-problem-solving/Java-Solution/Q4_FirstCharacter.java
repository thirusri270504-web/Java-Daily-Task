
import java.util.Scanner;

public class Q4_FirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        if (!s.isEmpty()) {
            System.out.println("First character: " + s.charAt(0));
        } else {
            System.out.println("String is empty.");
        }

        sc.close();
    }
}