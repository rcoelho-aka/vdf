package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiguelLopes {
    Student student = new Student("Miguel", "Lopes");

    @GetMapping("/miguel-lopes")
    public Student index() {
        return student;
    }
}

    

