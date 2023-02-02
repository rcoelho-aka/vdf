package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedroGoncalves {
    Student student = new Student("Pedro", "Goncalves");

    @GetMapping("/pedro-goncalves")
	public Student index() {
		return student;
	}

	@GetMapping("/pedro-goncalves/test")
	public String test() {
		return "test";
	}

}
