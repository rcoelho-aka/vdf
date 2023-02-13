package StudentApp.Students;
import StudentApp.Student;
public class DenysFlorindo {
    public static void sayName() {
        Student student = new Student("Denys", "Florindo");
        System.out.print("My name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
