package class2b;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(0, balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean withdraw(double amt) {
        if (amt > 0 && this.balance >= amt) {
            this.balance -= amt;
            return true;
        }
        return false;
    }

    public boolean deposit(double amt) {
        if (amt > 0) {
            this.balance += amt;
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount to, double amt) {
        // Pre-check condition: check if transfer amount is valid and source balance is sufficient
        if (to == null || amt <= 0 || this.balance < amt) {
            return false;
        }

        // Execute withdrawal and deposit safely
        if (this.withdraw(amt)) {
            if (to.deposit(amt)) {
                return true;
            } else {
                // Rollback withdrawal if deposit fails
                this.deposit(amt);
            }
        }
        return false;
    }
}

public class PracticeB_Task4 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC-101", 1000.0);
        BankAccount acc2 = new BankAccount("ACC-102", 200.0);

        System.out.println("Before Transfer -> ACC1: $" + acc1.getBalance() + " | ACC2: $" + acc2.getBalance());

        boolean success = acc1.transfer(acc2, 350.0);
        System.out.println("Transfer Success: " + success);

        System.out.println("After Transfer  -> ACC1: $" + acc1.getBalance() + " | ACC2: $" + acc2.getBalance());
    }
}