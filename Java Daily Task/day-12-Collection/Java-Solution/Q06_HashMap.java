import java.util.HashMap;
import java.util.Map;

public class Q06_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Arun", 85);
        students.put("Bala", 90);
        students.put("Kumar", 78);
        students.put("Ravi", 88);
        students.put("Suresh", 95);

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
