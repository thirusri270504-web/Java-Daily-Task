
import java.util.Scanner;

public class Q10_commonelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        int n1 = sc.nextInt();

        if (n1 < 1) {
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

        if (n2 < 1) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }

        int[] b = new int[n2];

        System.out.println("Enter array 2 elements:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Common Elements:");
        boolean found = false;

        for (int i = 0; i < n1; i++) {
            boolean exists = false;

            // Check whether already printed
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    exists = true;
                    break;
                }
            }

            if (exists) {
                continue;
            }

            // Search in second array
            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No common elements");
        }

        sc.close();
    }
}