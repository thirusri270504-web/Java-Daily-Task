import java.util.Scanner;

public class Q3_ascendingorder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Sorting in ascending order
        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (array[i] > array[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Ascending Order:");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}