import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Q10_RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        LinkedHashSet<Integer> uniqueNumbers =
                new LinkedHashSet<>(numbers);

        ArrayList<Integer> result = new ArrayList<>(uniqueNumbers);

        System.out.println("Original list: " + numbers);
        System.out.println("Without duplicates: " + result);
    }
}
