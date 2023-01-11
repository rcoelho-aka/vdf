public class FilipeGuerreiro {
    String firstName = "Filipe";
    String lastName = "Guerreiro";

    public FilipeGuerreiro(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void sayFirstName() {
        System.out.print(firstName);
    }

    public void sayLastName() {
        System.out.print(lastName);
    }

    public void sayName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }

}
