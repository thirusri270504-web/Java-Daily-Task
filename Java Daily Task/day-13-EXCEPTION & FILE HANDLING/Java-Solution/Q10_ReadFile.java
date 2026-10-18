import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q10_ReadFile {
    public static void main(String[] args) {
        String fileName = "day13-read-message.txt";

        try {
            try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(fileName))) {
                writer.write("Hello! This message is read from a file.");
            }

            try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {
                String line;

                System.out.println("File contents:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
