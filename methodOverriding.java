public class methodOverriding {
    public static void main(String[] args){
        // Method overriding: When a subclass provides a specific implementation of a method that is already defined in its superclass.
        Child2 obj = new Child2();
        obj.mean(); // This will call the overridden method in Child2 class

        Child1 obj1 = new Child1();
        obj1.mean(); // This will call the method from SuperClass
    }
}
