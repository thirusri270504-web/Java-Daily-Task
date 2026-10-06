import java.util.Scanner;

public class Q2_removeduplicate {

    public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < size; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (array[i] == array[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(array[i] + " ");
            }
        }

        sc.close();
    }
}
