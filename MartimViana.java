public class MartimViana {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void sayFirstName() {
        System.out.print(firstName);
    }

    public void sayLastName() {
        System.out.print(lastName);
    }

    public static void sayName() {
        System.out.print("My name is ");
        this.sayFirstName();
        System.out.print(" ");
        this.sayLastName();
        System.out.print("!");
    }
}
