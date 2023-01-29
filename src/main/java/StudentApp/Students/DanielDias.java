package StudentApp.Students;
import StudentApp.Student;

public class DanielDias {
    public static void sayName (){
        Student student = new Student("Daniel", "Dias");
        System.out.print("My Name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
