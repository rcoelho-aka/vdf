public class MartimViana {

    public static void sayName() {
        Student student = new Student("Martim", "Viana");
        System.out.print("My name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
