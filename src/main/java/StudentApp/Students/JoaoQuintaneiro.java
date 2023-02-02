package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JoaoQuintaneiro {
    Student student = new Student("Joao", "Quintaneiro");
    
    @GetMapping("/joao-quintaneiro")
	public Student index() {
		return student;
	}
}

