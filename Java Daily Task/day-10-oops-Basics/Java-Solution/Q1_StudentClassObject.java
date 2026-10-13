
public class Q1_StudentClassObject {

    static class Student {
        String name;
        int age;
        int mark;
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Praveen";
        s.age = 21;
        s.mark = 85;

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Mark: " + s.mark);
    }
}