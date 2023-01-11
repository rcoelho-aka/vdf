public class AfonsoAlves {
    public static void sayName() {
        Student student = new Student("Afonso", "Alves");
        System.out.print("My name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
