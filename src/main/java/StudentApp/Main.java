package StudentApp;
import StudentApp.Students.DenysFlorindo;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        Student student = new Student("Denys", "Florindo");
        System.out.println("Hello world!");
        System.out.println("My name is " + student.firstName + student.lastName);

    }
}
