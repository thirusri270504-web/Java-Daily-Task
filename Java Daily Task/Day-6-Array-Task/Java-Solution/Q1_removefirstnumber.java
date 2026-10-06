import java.util.Scanner;

public class Q1_removefirstnumber {

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
          

        int[] array = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Array after removing first number:");

        for (int i = 1; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
