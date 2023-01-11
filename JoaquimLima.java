public class JoaquimLima {
    public static void sayName() {
        Student student = new Student("Joaquim", "Lima");
        System.out.print("Hello My Name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
