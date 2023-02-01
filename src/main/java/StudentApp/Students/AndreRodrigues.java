package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AndreRodrigues {
    Student student = new Student("Andre", "Rodrigues");
    
    @GetMapping("/andre-rodrigues")
	public Student index() {
		return student;
	}
}