import java.util.Scanner;

public class Q3_ifelseif {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = sc.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("A Grade");
        } else if (mark >= 75) {
            System.out.println("B Grade");
        } else if (mark >= 50) {
            System.out.println("C Grade");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}