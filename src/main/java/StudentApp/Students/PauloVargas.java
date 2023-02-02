package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PauloVargas {
    Student student = new Student("Paulo", "Vargas");

    @GetMapping("/paulo-vargas")
    public Student index() {
        return student;
    }

    @GetMapping("/paulo-vargas/test")
    public String test() {
        return "test";
    }
}