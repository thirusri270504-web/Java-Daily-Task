
import java.util.Scanner;

public class Q3_CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim();

        int count = 0;

        if (!s.isEmpty()) {
            String[] words = s.split("\\s+");
            count = words.length;
        }

        System.out.println("Number of words: " + count);

        sc.close();
    }
}