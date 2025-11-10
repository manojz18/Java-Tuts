import java.util.Scanner;

public class bankingProgram {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        // Banking program starts here

        // set the variables

        boolean isRunning = true;
        double balance  = 0.0;
        int choice;

        // Display Menu

        System.out.println("********* Welcome to the Banking Program *********");
        System.out.println("Please choose an option:");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("**************************************************");

        // Get and process user input
        while(isRunning){
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice. Please try again.");
                    
            }
        }

        // show balance function

        // deposit function

        // withdraw function

        // Exit message
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println("Your current balance is: $" + balance);
    }

    static double deposit(){
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if(amount > 0){
            return amount;
        }
        System.out.println("Invalid amount. Deposit failed.");
        return 0;
    }

    static double withdraw(double balance){
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if(balance >= amount && amount > 0){
            return amount;
        }
        System.out.println("Invalid amount. Withdrawal failed.");
        return 0;
    }


}

