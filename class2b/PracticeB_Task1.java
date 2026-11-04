package class2b;

class Account {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

public class PracticeB_Task1 {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(500);
        System.out.println("Account Balance: $" + acc.getBalance());
    }
}