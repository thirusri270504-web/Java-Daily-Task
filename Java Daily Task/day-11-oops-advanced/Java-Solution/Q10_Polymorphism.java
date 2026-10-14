
public class Q10_Polymorphism {

    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog says: Woof Woof");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat says: Meow Meow");
        }
    }

    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
