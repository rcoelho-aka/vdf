

public class RicardoCoelho {
    public static void sayName() {
        Student student = new Student("Ricardo", "Coelho");
        System.out.print("My name is "); 
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");

    }
}
