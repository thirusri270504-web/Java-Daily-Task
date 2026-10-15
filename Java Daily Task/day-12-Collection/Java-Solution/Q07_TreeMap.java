import java.util.TreeMap;
import java.util.Map;

public class Q07_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(104, "Arun");
        employees.put(101, "Bala");
        employees.put(105, "Kumar");
        employees.put(102, "Ravi");
        employees.put(103, "Suresh");

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
