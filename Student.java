public class Student {
    int age;
    String name;
    double gpa;

    Student(int age, String name, double gpa){
        this.age = age;
        this.name = name;
        this.gpa = gpa;
    }

    void displayInfo(){
        System.out.println("Student named: " + name + " is studing.");
    }
}
