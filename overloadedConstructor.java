public class overloadedConstructor {
    // it demonstrates overloaded constructors in Java
    // A class with multiple constructors having different parameters

    overloadedConstructor() {
        System.out.println("Default constructor called");
    }

    overloadedConstructor(int age, String name){
        System.out.println("Constructor with age and name called");
        System.out.println("Name: " + name + ", Age: " + age);
    } 

    overloadedConstructor(int age, String name, double gpa){
        System.out.println("Constructor with age, name and gpa called");
        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);
    }

    public static void main(String[] args){
        overloadedConstructor obj1 = new overloadedConstructor();
        overloadedConstructor obj2 = new overloadedConstructor(21, "Charlie");
        overloadedConstructor obj3 = new overloadedConstructor(23, "Diana", 3.9);
    }

}
