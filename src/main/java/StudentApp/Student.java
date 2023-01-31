package StudentApp;

import java.beans.JavaBean;

@JavaBean
public class Student {

    public String firstName;
    public String lastName;

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

    public void sayFullName() {System.out.print("My name is " + firstName + " " + lastName + "!");}
}
