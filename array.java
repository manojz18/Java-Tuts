import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String[] args){
        // int[] arr = new int[5];

        // for(int i = 1; i <= 5; i++){
        //     arr[i] = i * 10;
        //     System.out.println("Element at index " + i + ": " + arr[i]);
        // }

        String[] fruits = {"Apple", "Mango", "Cherry", "Date", "Banana"};

        for(int i = 0; i < fruits.length; i++){
            System.out.println("Fruit at index " + i + ": " + fruits[i]);
        }

        // enhanced for loop

        // Arrays.sort(fruits);
        // Arrays.fill(fruits, "Juicy Pineapple");

        for(String fruit : fruits){
            System.out.println("Fruit: " + fruit);
        }

        String[] foods = new String[4];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter food item " + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println("food: " + food);
        }

        scanner.close();
    }
}
