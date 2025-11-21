public class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void showFullName(){
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}
