
public class PauloVargas {
    public static void sayName() {
        Student student = new Student("Paulo", "Vargas");
        System.out.print("My name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}