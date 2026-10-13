
public class Q8_ConstructorOverloading {

    static class Person {
        String name;
        int age;

        Person() {
            name = "Unknown";
            age = 0;
        }

        Person(String name) {
            this.name = name;
            age = 0;
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Arun");
        Person p3 = new Person("Kumar", 21);

        p1.display();
        p2.display();
        p3.display();
    }
}