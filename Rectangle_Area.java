import java.util.Scanner;

public class Rectangle_Area {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double length, width, area = 0.0;

        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();

        area = length * width;
        System.out.println("The area of the rectangle is: " + area + " cm²");
        scanner.close();
    }
}