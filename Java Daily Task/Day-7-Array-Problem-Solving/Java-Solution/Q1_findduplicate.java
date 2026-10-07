
import java.util.Scanner;

public class Q1_findduplicate {
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

        System.out.println("Duplicate Elements:");

        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate elements");
        }

        sc.close();
    }
}