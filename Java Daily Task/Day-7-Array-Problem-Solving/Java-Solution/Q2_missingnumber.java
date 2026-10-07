
import java.util.Scanner;

public class Q2_missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("N must be at least 2");
            sc.close();
            return;
        }

        int[] a = new int[n - 1];

        System.out.println("Enter " + (n - 1)
                + " numbers from 1 to " + n
                + " with one number missing:");

        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }

        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int i = 0; i < a.length; i++) {
            actualSum += a[i];
        }

        System.out.println("Missing Number: "
                + (expectedSum - actualSum));

        sc.close();
    }
}