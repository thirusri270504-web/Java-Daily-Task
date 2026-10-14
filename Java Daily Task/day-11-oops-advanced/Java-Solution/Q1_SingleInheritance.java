
public class Q1_SingleInheritance {

    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}
