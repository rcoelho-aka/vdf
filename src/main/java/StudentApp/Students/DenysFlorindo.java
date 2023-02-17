package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;

/*// Linhas abaixo para os exercicios de GIT
public class DenysFlorindo {
    public static void sayName() {
        Student student = new Student("Denys", "Florindo");
*//*    student.sayFirstName();
    student.sayLastName();
*//*
        System.out.print("My name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}*/

// Linhas abaixo para os exercicios de CI-CD
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DenysFlorindo {
    Student student = new Student("Denys", "Florindo");

    @GetMapping("/denys-florindo")
    public Student index() { return student; }

    @GetMapping("/denys-florindo/test")
    public String test() { return "test"; }

}
