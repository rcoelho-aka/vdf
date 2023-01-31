package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RicardoCoelho {
    Student student = new Student("Ricardo", "Coelho");

    @GetMapping("/ricardo-coelho")
	public Student index() {
		String firstName = "Ricardo";
		String lastName = "Coelho";

		return student;
	}
}
