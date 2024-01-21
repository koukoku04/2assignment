import models.Person;
import models.Employee;
import models.Student;
import java.util.ArrayList;

public class Main {
    private ArrayList<Person> personList = new ArrayList<>();
    private ArrayList<Employee> employeeList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        Main mainInstance = new Main();
        mainInstance.initializeData();
        mainInstance.printData();
    }

    private void initializeData() {
        Person Ringo = new Person("Ringo", "Star");
        Ringo.setSalary(0);

        Employee John = new Employee("John", "Lennon", "student", 27045);

        Student Paul = new Student("Paul", "McCartney", 2.7);
        Student George = new Student("George", "Harrison", 2.1);

        this.personList.add(Ringo);
        this.employeeList.add(John);
        this.studentList.add(Paul);
        this.studentList.add(George);
    }

    public void printData() {
        for (Person person : personList) {
            System.out.println(person);
        }

        for (Student student : studentList) {
            System.out.println(student);
        }

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
