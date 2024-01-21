package models;

public class Employee implements Payable {
    private final int id;
    private static int savedId = 0;
    private String name;
    private String surname;
    private String position;
    private int salary;

    public Employee() {
        this.id = ++savedId;
    }

    public Employee(String name, String surname, String position, int salary) {
        this();
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return "Employee "+id + ". " + name+" "+ surname+ ", earn: " +salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return this.salary;
    }
}
