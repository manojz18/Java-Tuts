public class Constructors {
    public static void main(String[] args){
        Student student1 = new Student(20, "Alice", 3.8);
        Student student2 = new Student(22, "Bob", 3.5);
        System.out.println("Student 1: " + student1.name + ", Age: " + student1.age + ", GPA: " + student1.gpa);
        System.out.println("Student 2: " + student2.name + ", Age: "
            + student2.age + ", GPA: " + student2.gpa);
        
        student1.displayInfo();
        student2.displayInfo();
        
    }
}
