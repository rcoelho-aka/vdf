package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class AfonsoAlves {
    Student student = new Student("Afonso", "Alves");

    @GetMapping("/afonso-alves")
    public Student index() {
        return student;
    }

    @GetMapping("/afonso-alves/test")
    public String test() {
        return "test";
    }
}
