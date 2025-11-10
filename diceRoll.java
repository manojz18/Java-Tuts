import java.util.Random;
import java.util.Scanner;

public class diceRoll {
    
    public static void main(String[] args) {
        Random random = new Random();
        int numOfDice = 0;
        int total = 0;
        
        System.out.print("Enter the number of dice to roll: ");
        Scanner scanner = new Scanner(System.in);
        numOfDice = scanner.nextInt();

        if(numOfDice > 0){
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("Die " + (i + 1) + ": " + roll);
                total += roll;
            }
            System.out.println("Total of all dice: " + total);
        }
        else{
            System.out.println("Please enter a positive number of dice.");
        }

    }

    static void printDie(int roll){
        switch(roll){
            case 1 -> System.out.println("-----\n|   |\n| * |\n|   |\n-----");
            case 2 -> System.out.println("-----\n|*  |\n|   |\n|  *|\n-----");
            case 3 -> System.out.println("-----\n|*  |\n| * |\n|  *|\n-----");
            case 4 -> System.out.println("-----\n|* *|\n|   |\n|* *|\n-----");
            case 5 -> System.out.println("-----\n|* *|\n| * |\n|* *|\n-----");
            case 6 -> System.out.println("-----\n|* *|\n|* *|\n|* *|\n-----");
            default -> System.out.println("Invalid die number.");
        }
    }
}
