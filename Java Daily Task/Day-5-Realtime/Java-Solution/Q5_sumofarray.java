import java.util.Scanner;

public class Q5_sumofarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        int sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {

            array[i] = sc.nextInt();

            sum = sum + array[i];
        }

        System.out.println("Array elements:");

        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.println("Sum of array = " + sum);

        sc.close();
    }
}