package StudentApp.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import StudentApp.Student;

@RestController
public class AntonioSantos {
    Student student = new Student("Antonio", "Santos");
    @GetMapping("/antonio-santos")    
    public Student index(){
        return student;
    }
    
}
