
public class Q5_BankAccountEncapsulation {

    static class BankAccount {
        private double balance;

        void deposit(double amount) {
            if (amount > 0) {
                balance = balance + amount;
                System.out.println("Deposit successful");
            }
        }

        void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawal successful");
            } else {
                System.out.println("Insufficient balance");
            }
        }

        void displayBalance() {
            System.out.println("Balance: Rs." + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.withdraw(1000);
        account.displayBalance();
    }
}