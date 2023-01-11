public class PedroGoncalves {
    public static void sayName() {
        Student student = new Student("Pedro", "Goncalves");
        System.out.print("My name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}