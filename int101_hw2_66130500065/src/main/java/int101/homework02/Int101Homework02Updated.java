package int101.homework02;


import work01.Utilitor;
import work02.Person;
import work03.Account;

public class Int101Homework02Updated {


    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }


    static void work01Utilitor() {
        String validValue = Utilitor.testString("Hello, World!");
        System.out.println("Valid Value: " + validValue);

        double positiveValue = Utilitor.testPositive(10.5);
        System.out.println("Positive Value: " + positiveValue);

        long isbn10 = 123456789;
        long checkDigit = Utilitor.computeIsbn10(isbn10);
        System.out.println("ISBN-10 Check Digit: " + checkDigit);
        System.out.println();
    }


    static void work02Person() {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Smith");

        System.out.println("Person 1 ID: " + person1.getId());
        System.out.println("Person 1 Firstname: " + person1.getFirstName());
        System.out.println("Person 1 Lastname: " + person1.getLastName());

        person1.setFirstName("Michael");
        person1.setLastName("Johnson");
        System.out.println("Updated Person 1: " + person1);

        System.out.println("person1 equals person2: " + person1.equals(person2));
        Person person3 = person1;
        System.out.println("person1 equals person3: " + person1.equals(person3));
        System.out.println();
    }


    static void work03Account() {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Smith");

        Account account1 = new Account(person1);
        Account account2 = new Account(person2);

        account1.deposit(100.0);
        System.out.println("Account 1 Balance after deposit: " + account1.getBalance());

        account1.withdraw(50.0);
        System.out.println("Account 1 Balance after withdrawal: " + account1.getBalance());

        account1.transfer(25.0, account2);
        System.out.println("Account 1 Balance after transfer: " + account1.getBalance());
        System.out.println("Account 2 Balance after transfer: " + account2.getBalance());

        System.out.println("Account 1: " + account1);

        Account account3 = account1;
        System.out.println("account1 equals account2: " + account1.equals(account2));
        System.out.println("account1 equals account3: " + account1.equals(account3));
    }
}