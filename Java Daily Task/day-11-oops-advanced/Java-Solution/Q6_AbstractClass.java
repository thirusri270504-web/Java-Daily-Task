
public class Q6_AbstractClass {

    abstract static class Shape {
        abstract void draw();
    }

    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
