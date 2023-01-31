package StudentApp.Students;
import StudentApp.Student;

public class AntonioSantos {
    public static void sayName() {
        Student student = new Student("Antonio", "Santos");
        System.out.print("My name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
