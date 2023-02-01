package StudentApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!\n\n  Vasco Baptista was here !!! ";
	}

}
