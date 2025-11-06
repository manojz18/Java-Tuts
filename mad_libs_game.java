import java.util.Scanner;

public class mad_libs_game {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjective1, noun1, adjective2, verb1, adjective3;

        System.out.print("Enter an adjective(description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun1(animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective(description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ending with -ing: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective(description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I Went to " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was smelly and " + verb1 + ".");
        System.out.println("It was " + adjective3 + "!");

     }
}
