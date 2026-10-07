
import java.util.Scanner;

public class Q7_mergearrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        int n1 = sc.nextInt();

        if (n1 < 0) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }

        int[] a = new int[n1];

        System.out.println("Enter array 1 elements:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of array 2: ");
        int n2 = sc.nextInt();

        if (n2 < 0) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }

        int[] b = new int[n2];

        System.out.println("Enter array 2 elements:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = a[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = b[i];
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }

        sc.close();
    }
}