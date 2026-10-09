
import java.util.Scanner;

public class Q10_removespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = s.replace(" ", "");

        System.out.println("String without spaces: " + result);

        sc.close();
    }
}