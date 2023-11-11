package work03;

import work01.Utilitor;
import work02.Person;

public class Account {
    private static long nextNo = 100_000_000;
    private final long no;
    private Person owner;
    private double balance;

    public Account(Person owner) {
        if (owner == null) {
            throw new NullPointerException();
        }

        this.owner = owner;
        this.balance = 0.0;

        long result = Utilitor.computeIsbn10(nextNo);
        while (result != 10) {
            result = Utilitor.computeIsbn10(++nextNo);
        }
        this.no = 10 * nextNo++ + result;
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        return balance += Utilitor.testPositive(amount);
    }

    public double withdraw(double amount) {
        if (this.balance - amount < 0) throw new IllegalArgumentException();
        return this.balance -= Utilitor.testPositive(amount);
    }

    public void transfer(double amount, Account account) {
        if (account == null) {
            throw new IllegalArgumentException();
        }

        withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "Account(" + no + "," + balance + ")";
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }
}
