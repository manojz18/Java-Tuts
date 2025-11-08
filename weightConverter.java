import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        double convertedWeight;
        int choice;

        // if choice 1, pounds to kilograms
        // if choice 2, kilograms to pounds
        // if choices other than 1 or 2, invalid choice

        System.out.print("Enter weight: ");
        weight = scanner.nextDouble();
        System.out.println("Choose conversion type:");
        System.out.println("1. Pounds to Kilograms");
        System.out.println("2. Kilograms to Pounds");
        System.out.print("Enter your choice (1 or 2): ");
        choice = scanner.nextInt();

        if(choice == 1){
            convertedWeight = weight * 0.453592;
            System.out.printf("%.2f Pounds is equal to %.2f Kilograms.%n", weight, convertedWeight);
    
        }
        else if(choice == 2){
            convertedWeight = weight / 0.453592;
            System.out.printf("%.2f Kilograms is equal to %.2f Pounds.%n", weight, convertedWeight);
        }
        else{
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

    }
}
