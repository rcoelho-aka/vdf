public class JoaoMarques {
    public static void sayName() {
        Student myName = new Student("Joao", "Marques");

        System.out.print("My name is : " );
        myName.sayFirstName();
        myName.sayLastName();
        System.out.print("!");
    }


}