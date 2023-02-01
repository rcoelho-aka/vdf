package StudentApp.Students;
import StudentApp.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsabelSoares {
    Student student = new Student("Isabel", "Soares");

    @GetMapping("/isabel-soares")
    public Student index() {
        return student;
    }


}
