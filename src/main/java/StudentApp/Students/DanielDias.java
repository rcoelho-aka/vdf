package StudentApp.Students;
import StudentApp.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DanielDias {

    Student student = new Student("Daniel", "Dias");

    @GetMapping("/daniel-dias")
    public Student index (){
        return student;
    }

}
