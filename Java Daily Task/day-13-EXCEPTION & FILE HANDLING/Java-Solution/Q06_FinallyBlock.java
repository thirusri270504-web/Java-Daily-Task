public class Q06_FinallyBlock {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
