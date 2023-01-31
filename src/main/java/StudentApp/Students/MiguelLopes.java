package StudentApp.Students;
import StudentApp.Student;

public class MiguelLopes {
    public static void sayName() {
        Student student = new Student("Miguel", "Lopes");
        System.out.print("My name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }

    
}
