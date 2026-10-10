
import java.util.Scanner;

public class Q8_DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String checked = "";
        String duplicates = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ' || checked.indexOf(ch) != -1) {
                continue;
            }

            checked = checked + ch;

            if (s.indexOf(ch) != s.lastIndexOf(ch)) {
                if (!duplicates.isEmpty()) {
                    duplicates = duplicates + ", ";
                }

                duplicates = duplicates + ch;
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate characters found.");
        } else {
            System.out.println("Duplicate characters: " + duplicates);
        }

        sc.close();
    }
}