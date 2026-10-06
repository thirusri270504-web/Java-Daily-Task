import java.util.Scanner;

public class Q5_removefirstduplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int duplicateIndex = -1;
        int duplicateValue = 0;

        // Find first duplicate
        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (array[i] == array[j]) {

                    duplicateIndex = i;
                    duplicateValue = array[i];

                    break;
                }
            }

            if (duplicateIndex != -1) {
                break;
            }
        }

        if (duplicateIndex == -1) {

            System.out.println("No duplicate value found.");

        } else {

            System.out.println("First duplicate value: " + duplicateValue);

            // Remove first duplicate
            for (int i = duplicateIndex; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            System.out.println("Array after removing first duplicate:");

            for (int i = 0; i < size - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }

        sc.close();
    }
}