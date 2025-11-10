public class varargs {
    //variable arguments: means  a method that contains variable number of arguments

    public static void main(String[] args){
        System.out.println("Sum of 2 and 3: " + sum(2, 3));
        System.out.println("Sum of 5, 10 and 15: " + sum(5, 10, 15));
        System.out.println("Sum of 1, 2, 3, 4 and 5: " + sum(1, 2, 3, 4, 5));
    }

    static int sum(int... numbers){
        int total = 0;

        for(int number : numbers){
            total += number;
        }

        return total;
    }
}
