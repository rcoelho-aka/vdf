package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AntonioSantos {
    Student student = new Student("Antonio", "Santos");

    @GetMapping("/antonio-santos")        
    public Student index(){
        return student;
    }

    @GetMapping("/antonio-santos/test")
    public String test(){
        return "test";
    }
    
}
