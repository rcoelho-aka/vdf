public class IsabelSoares {
    public static void sayName() {
        Student student = new Student("Isabel", "Soares");
        System.out.print("Hello My Name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
