package models;

public class Person implements Payable {

    private static int savedId = 0;
    private final int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    public Person(String name, String surname) {
        this.id = ++savedId;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPosition() {
        return (this.position != null) ? this.position : "Student";
    }

    public String toString() {
        return "Person "+id + ". " + name + " " + surname+", earn: "+salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return this.salary;
    }
}
