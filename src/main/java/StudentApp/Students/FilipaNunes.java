package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilipaNunes {
    Student student = new Student("Filipa", "Nunes");
    @GetMapping("/filipa-nunes")
    public Student index() {
        return student;
    }

}


