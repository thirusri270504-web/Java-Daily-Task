import java.io.FileWriter;
import java.io.IOException;

public class Q09_WriteFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("day13-message.txt")) {
            writer.write("Hello! This message is written to a file.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
