package work02;

import work01.Utilitor;

public class Person {
    private static int nextId = 1;
    private final int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = Utilitor.testString(firstName);
        this.lastName = Utilitor.testString(lastName);
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = Utilitor.testString(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = Utilitor.testString(lastName);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Person(").append(this.id).append(", ").append(this.firstName).append(", ").append(this.lastName).append(")").toString();
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

}
