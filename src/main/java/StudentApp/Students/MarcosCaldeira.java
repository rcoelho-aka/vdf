package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarcosCaldeira {
	    Student student = new Student("Marcos", "Caldeira");

	        @GetMapping("/marcos-caldeira")
		        public Student index() {
				                return student;
			}
}
