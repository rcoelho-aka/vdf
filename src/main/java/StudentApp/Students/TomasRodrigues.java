package StudentApp.Students;
import StudentApp.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomasRodrigues {
    Student student = new Student("Tomás", "Rodrigues");

    @GetMapping("/tomas-rodrigues")
    public Student index() {
        return student;
    }
}
