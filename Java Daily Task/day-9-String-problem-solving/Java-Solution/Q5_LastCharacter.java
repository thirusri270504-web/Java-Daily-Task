
import java.util.Scanner;

public class Q5_LastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        if (!s.isEmpty()) {
            System.out.println("Last character: "
                    + s.charAt(s.length() - 1));
        } else {
            System.out.println("String is empty.");
        }

        sc.close();
    }
}