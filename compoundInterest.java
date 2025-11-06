import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        double principal, rate, timecCompound, amount, years;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the time (in years): ");
        years = scanner.nextDouble();
        System.out.print("Enter the number of times interest is compounded per year: ");
        timecCompound = scanner.nextDouble();
        scanner.close();

        amount = principal * Math.pow(1+ rate/timecCompound, timecCompound*years);
        System.out.printf("The amount after %.2f years is: %.2f Rs.", years, amount);   

    }
}
