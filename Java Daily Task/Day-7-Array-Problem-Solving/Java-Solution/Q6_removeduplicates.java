
import java.util.Scanner;

public class Q6_removeduplicates {
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

        System.out.println("After Removing Duplicates:");

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(a[i] + " ");
            }
        }

        sc.close();
    }
}