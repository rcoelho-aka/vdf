package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AndreRibeiro {
    Student student = new Student("Andre", "Ribeiro");

    @GetMapping("/andre-ribeiro")
    public Student index() {
        return student;
    }

    @GetMapping("/andre-ribeiro/test")
    public String test() {
        return "test";
    }

}

