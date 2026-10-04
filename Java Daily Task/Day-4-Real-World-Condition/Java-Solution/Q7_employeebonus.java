
import java.util.Scanner;

public class Q7_employeebonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of experience: ");
        int years = sc.nextInt();

        if (salary < 0 || years < 0) {
            System.out.println("Invalid Input");
        } else {
            double rate;

            if (years >= 10) {
                rate = 20;
            } else if (years >= 5) {
                rate = 15;
            } else if (years >= 2) {
                rate = 10;
            } else {
                rate = 5;
            }

            double bonus = salary * rate / 100;
            double finalSalary = salary + bonus;

            System.out.println("Salary: Rs." + salary);
            System.out.println("Bonus Rate: " + rate + "%");
            System.out.println("Bonus: Rs." + bonus);
            System.out.println("Final Salary: Rs." + finalSalary);
        }

        sc.close();
    }
}