
public class Q2_EmployeeConstructor {

    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee("Arun", 30000);

        System.out.println("Name: " + e.name);
        System.out.println("Salary: Rs." + e.salary);
    }
}