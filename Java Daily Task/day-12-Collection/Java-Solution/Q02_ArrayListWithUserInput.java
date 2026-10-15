import java.util.ArrayList;
import java.util.Scanner;

public class Q02_ArrayListWithUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            numbers.add(number);
            sum += number;
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
