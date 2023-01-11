
public class TomasRodrigues {

    public static void sayName() {
    	Student student = new Student("Tomás", "Rodrigues");
    	System.out.print("My name is ");
    	student.sayFirstName();
    	System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
