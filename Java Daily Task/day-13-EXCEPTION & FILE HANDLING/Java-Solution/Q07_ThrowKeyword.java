import java.util.Scanner;

public class Q07_ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new IllegalArgumentException(
                    "Age must be 18 or above."
                );
            }

            System.out.println("Person is eligible.");
        } catch (IllegalArgumentException e) {
            System.out.println("Not eligible: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
