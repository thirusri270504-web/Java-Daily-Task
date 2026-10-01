import java.util.Scanner;

public class Q1_simpleif {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        sc.close();
    }
}