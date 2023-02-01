package StudentApp.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import StudentApp.Student;

@RestController
public class MartimViana {
    Student student = new Student("Martim", "Viana");

    @GetMapping("/martim-viana")
	public Student index() {
		return student;
	}
}
