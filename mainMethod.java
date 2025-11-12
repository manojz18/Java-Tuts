public class mainMethod {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("Car Details:");
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.model);
        System.out.println("Color: " + myCar.color);
        System.out.println("Price: $" + myCar.price);
        myCar.start();
        System.out.println("Is the car running? " + myCar.isRunning);
        myCar.stop();
        System.out.println("Is the car running? " + myCar.isRunning);   

    }
}
