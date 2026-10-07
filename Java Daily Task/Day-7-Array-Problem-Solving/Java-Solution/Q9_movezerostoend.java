
import java.util.Scanner;

public class Q9_movezerostoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int index = 0;

        // Copy non-zero elements first
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[index] = a[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < n) {
            a[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}