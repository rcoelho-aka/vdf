package StudentApp.Students;
import StudentApp.Student;

public class JoaoQuintaneiro {
    public static void sayName() {
        Student student = new Student("João", "Quintaneiro");
        System.out.print("My Name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
