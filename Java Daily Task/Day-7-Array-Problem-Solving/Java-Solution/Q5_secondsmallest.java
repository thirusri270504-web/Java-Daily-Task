
import java.util.Scanner;

public class Q5_secondsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("At least 2 elements required");
            sc.close();
            return;
        }

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int smallest = a[0];
        int second = 0;
        boolean found = false;

        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                second = smallest;
                smallest = a[i];
                found = true;
            } else if (a[i] > smallest) {
                if (!found || a[i] < second) {
                    second = a[i];
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Second Smallest: " + second);
        } else {
            System.out.println("No second smallest distinct element");
        }

        sc.close();
    }
}