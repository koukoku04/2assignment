package models;

public class Student implements Payable {
    private final int id;
    private static int savedId = 0;
    private String name;
    private String surname;
    private double gpa;

    private double salary;

    public Student(String name, String surname, double gpa) {
        this.id = ++savedId;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String toString() {
        return "Student "+id + "." + name +" " +surname + " gpa: " + gpa+", earn: "+getPaymentAmount();
    }

    @Override
    public double getPaymentAmount() {
        if (this.gpa > 2.67) {
            this.salary += 36660;
        }
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public double getGPA() {
        return this.gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }
}
