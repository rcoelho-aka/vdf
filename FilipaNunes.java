public class FilipaNunes {
    public static void sayName() {
        Student student = new Student("Filipa", "Nunes");
        System.out.print("My name is ");
        student.sayFirstName();
        System.out.print(" ");
        student.sayLastName();
        System.out.print("!");
    }
}