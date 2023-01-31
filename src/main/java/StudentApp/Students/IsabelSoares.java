package StudentApp.Students;
import StudentApp.Student;

public class IsabelSoares {
    public static void sayName() {
        Student student = new Student("Isabel", "Soares");
        System.out.print("My Name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
