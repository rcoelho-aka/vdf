public class ViniciusLuz {
    public static void sayName() {
        Student student = new Student("Vinicius", "Luz");
        System.out.print("Hello name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}
