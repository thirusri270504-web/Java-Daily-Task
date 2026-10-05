import java.util.Scanner;

public class Q2_fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= terms; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }

        sc.close();
    }
}