
import java.util.Scanner;

public class Q3_countfrequency {
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

        System.out.print("Enter search element: ");
        int search = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == search) {
                count++;
            }
        }

        System.out.println("Frequency: " + count);

        sc.close();
    }
}