package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VascoBatista {
    Student student = new Student("Vasco", "Baptista");

    @GetMapping("/vasco-batista")
	public Student index() {
		return student;
	}

	@GetMapping("/vasco-batista/test")
	public String test() {
		return "test";
	}

}
