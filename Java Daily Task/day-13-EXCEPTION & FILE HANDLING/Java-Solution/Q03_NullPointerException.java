public class Q03_NullPointerException {
    public static void main(String[] args) {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("String value is null.");
        }
    }
}
