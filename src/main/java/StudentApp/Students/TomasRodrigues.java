package StudentApp.Students;
import StudentApp.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomasRodrigues {
    Student student = new Student("Tomás", "Rodrigues");
    Student student1 = new Student("Teste", "Teste1");

    @GetMapping("/tomas-rodrigues")
    public Student index() {
        return student;
    }
    @GetMapping("/teste")
    public Student test() {return student1; }
}
