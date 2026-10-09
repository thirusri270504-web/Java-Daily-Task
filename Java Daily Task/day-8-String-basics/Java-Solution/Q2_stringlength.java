
import java.util.Scanner;

public class Q2_stringlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Length: " + s.length());

        sc.close();
    }
}