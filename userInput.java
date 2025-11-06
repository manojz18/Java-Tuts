// 1. import the scanner class
import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        // how to take input from user
        // 1. import the scanner class
        // 2. create the object of scanner class
        // 3. use the scanner object to take input using next(), nextInt(), nextDouble(), nextLine() methods


        // 2. create the object of scanner class
        Scanner scanner = new Scanner(System.in);
        
        // 3. use the scanner object to take input using next(), nextInt(), nextDouble(), nextLine() methods
        // input string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
        
        // input integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Your age is: " + age);

        // input double
        System.out.print("Enter your Weight in kgs: ");
        double weight = scanner.nextDouble();
        System.out.println("Your weight is: " + weight + " kgs");

        // input boolean
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Are you a student: " + isStudent);

        // 1 problem while taking input
        // after taking integer or double input, if we try to take string input using nextLine() method
        // it will be skipped
        // use scanner.nextLine(); // to consume the leftover newline character

        // example
        System.out.print("Enter your favorite number: ");
        int favNumber = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline character
        System.out.print("Enter your favorite color: ");
        String favColor = scanner.nextLine();
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite color is: " + favColor);
        scanner.close();
    }


}
