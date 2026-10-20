import java.util.Scanner;

public class Q02_BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Enter a positive amount.");
                    }
                    break;

                case 2:
                    System.out.print("Withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Enter a positive amount.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                    }
                    break;

                case 3:
                    System.out.printf("Balance: %.2f%n", balance);
                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
