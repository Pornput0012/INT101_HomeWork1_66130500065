package work04;

public class BankAccount {

    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public void transfer(double amount, BankAccount account) {
        if (this.balance - amount > 0) {
            account.deposit(amount);
            this.withdraw(amount);
        } else {
            System.out.println("balance is not enough.");
        }
    }

    @Override
    public String toString() {
        return "BankAccount(" + this.owner.getId() + ")";
    }
}
