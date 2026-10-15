import java.util.ArrayList;
import java.util.Iterator;

public class Q08_Iterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Arun");
        names.add("Bala");
        names.add("Kumar");
        names.add("Ravi");
        names.add("Suresh");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
