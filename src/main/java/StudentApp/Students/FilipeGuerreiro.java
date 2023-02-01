package StudentApp.Students;
import StudentApp.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilipeGuerreiro {
    
    public static void sayName(){
        

        Student student =  new Student("Filipe", "Guerreiro");

        @GetMapping("/filipe-guerreiro")
        public Student index() {
            return student;
        }

        @GetMapping("/filipe-guerreiro/test")
	        public String test() {
		    return "test";
	    }




        /*System.out.print("My name is ");
        
        student.sayFirstName();

        System.out.print(" ");

        student.sayLastName();

        System.out.print("!");*/

    }

}
