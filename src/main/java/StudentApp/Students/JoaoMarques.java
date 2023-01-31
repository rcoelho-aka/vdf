package StudentApp.Students;
import StudentApp.Student;

public class JoaoMarques {
    public static void sayName() {
        Student myName = new Student("Joao", "Marques");

        System.out.print("My name is " );
        myName.sayFirstName();
        System.out.print(" ");
        myName.sayLastName();
        System.out.print("!");
    }


}