package StudentApp.Students;
import StudentApp.Student;

public class VascoBatista {
    public static void sayName() {
        Student student = new Student("Vasco", "Baptista");
        System.out.print("My name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }


   
}
