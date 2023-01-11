
public class Student {
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
}
