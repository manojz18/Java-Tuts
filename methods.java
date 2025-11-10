public class methods {
    public static void main(String[] args) {
        // System.out.println("This main class contains no methods.");
        String result = exampleMethod();
        System.out.println("Calling exampleMethod from main:" + result);
    }

    static String exampleMethod() {
        // This is an example method
        System.out.println("Hello from exampleMethod!");
        return "Method executed";
    } 
    
}
