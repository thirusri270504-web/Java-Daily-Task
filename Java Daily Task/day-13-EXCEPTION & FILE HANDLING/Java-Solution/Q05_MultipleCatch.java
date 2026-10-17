public class Q05_MultipleCatch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            int result = numbers[5] / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid.");
        }
    }
}
