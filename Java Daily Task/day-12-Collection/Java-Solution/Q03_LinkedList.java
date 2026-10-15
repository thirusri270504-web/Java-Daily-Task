import java.util.LinkedList;

public class Q03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");

        fruits.remove("Orange");

        System.out.println("Remaining fruits: " + fruits);
    }
}
