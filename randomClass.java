import java.util.Random;

public class randomClass {
    public static void main(String[] args){
        Random random = new Random();

        int diceRoll = random.nextInt(1, 7);
        System.out.println("You rolled a: " + diceRoll);
    }
}
