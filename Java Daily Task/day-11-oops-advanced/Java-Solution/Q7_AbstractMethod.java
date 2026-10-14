
public class Q7_AbstractMethod {

    abstract static class Employee {
        abstract void calculateSalary();
    }

    static class Developer extends Employee {
        @Override
        void calculateSalary() {
            double salary = 30000;
            System.out.println("Developer Salary: Rs." + salary);
        }
    }

    public static void main(String[] args) {
        Developer d = new Developer();
        d.calculateSalary();
    }
}
