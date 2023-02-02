package StudentApp.Students;
import StudentApp.Student;

public class AndreMatias {
    public static void sayName() {
        Student student = new Student("Andre", "Matias");
        System.out.print("My name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
