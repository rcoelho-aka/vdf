package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PauloVargas {
    Student student = new Student("Paulo", "Vargas");

    @GetMapping
    public Student index() {
        return student;
    }
}