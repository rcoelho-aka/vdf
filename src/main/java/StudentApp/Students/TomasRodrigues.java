package StudentApp.Students;
import StudentApp.Student;
import org.springframework.web.bind.annotation.GetMapping;

public class TomasRodrigues {

    /*public static void sayName() {
    	Student student = new Student("Tomás", "Rodrigues");
    	System.out.print("My name is ");
    	student.sayFirstName();
    	System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }*/
    Student student = new Student("Tomás", "Rodrigues");

    @GetMapping("/tomas-rodrigues")
    public Student index() {
        return student;
    }
}
