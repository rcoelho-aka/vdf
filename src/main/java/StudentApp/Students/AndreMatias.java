package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RicardoCoelho {
    Student student = new Student("Andre", "Matias");

    @GetMapping("/andre-matias")
    public Student index() {
        return student;
    }

    @GetMapping("/andre-matias/test")
    public String test() {
        return "VAMOOOO";
    }

}