
import java.util.Scanner;

public class Q10_ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String reverse = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse = reverse + words[i].charAt(j);
            }

            result = result + reverse + " ";
        }

        System.out.println("Reversed words: " + result.trim());

        sc.close();
    }
}