public class mathClass {
    public static void main(String[] args){
        
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2, 5));
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(4, 9));
        System.out.println(Math.min(4, 9));
        System.out.println(Math.round(5.7));
        System.out.println(Math.ceil(5.3));
        System.out.println(Math.floor(5.7));
        System.out.println(Math.random());
        System.out.println(Math.random() * 100);
        System.out.println((int)(Math.random() * 100) + 1);
        System.out.println(Math.PI);
        System.out.println(Math.E);
        
        // printf class
        double num = 5.6789;
        int intNum = 42;
        String str = "Hello, World!";
        boolean bool = true;

        System.out.printf("The doubled number is %f", num);
        System.out.printf("\nThe integer number is %d", intNum);
        System.out.printf("\nThe string is: %s", str);
        System.out.printf("\nThe boolean value is: %b", bool);

        System.out.printf("%.2f \n", num); // limiting to 2 decimal places
        System.out.printf("% .1f \n", num); // space for positive numbers and minus for negative
        System.out.printf("%+.2f \n", num); // plus or minus sign
        System.out.printf("%06.2f \n", num); // leading zeros to make width 6

        System.out.printf("%04d \n", intNum); // leading zeros to make width 4(padding)
    
    }
}