package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MariaCaldeira {
    Student student = new Student("Maria", "Caldeira");

    @GetMapping("/maria-caldeira")
    public Student index() {
        return student;
    }
}
