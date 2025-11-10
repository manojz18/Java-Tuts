import java.util.Scanner;

public class enhanceSwitch {
    public static void main(String[] args){
        String day = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        day = scanner.nextLine().toUpperCase();

        switch (day){
            case "MONDAY" -> System.out.println("Start of the work week.");
            case "TUESDAY" -> System.out.println("Second day of the work week.");
            case "WEDNESDAY" -> System.out.println("Midweek day.");
            case "THURSDAY" -> System.out.println("Almost the weekend.");
            case "FRIDAY" -> System.out.println("Last day of the work week.");
            case "SATURDAY", "SUNDAY" -> System.out.println("It's the weekend!");
            default -> System.out.println("Not a valid day.");
        }

        scanner.close();
    }
}
