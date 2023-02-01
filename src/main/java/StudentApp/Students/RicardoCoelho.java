package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RicardoCoelho {
    Student student = new Student("Ricardo", "Coelho");

    @GetMapping("/ricardo-coelho")
	public Student index() {
		return student;
	}

	@GetMapping("/ricardo-coelho/test")
	public String test() {
		return "test";
	}

}
