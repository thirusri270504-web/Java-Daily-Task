
public class Q8_Interface {

    interface Printable {
        void print();
    }

    static class Document implements Printable {
        @Override
        public void print() {
            System.out.println("Printing the document");
        }
    }

    public static void main(String[] args) {
        Document d = new Document();
        d.print();
    }
}
