
public class Q4_RectangleClass {

    static class Rectangle {
        int length;
        int width;

        Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        int area() {
            return length * width;
        }

        int perimeter() {
            return 2 * (length + width);
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}