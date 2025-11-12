public class Car {
    double price = 100000.99;
    String color = "Black";
    String model = "BMW X5";
    String brand = "BMW";
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("Car is started");
    }

    void stop(){
        isRunning = false;
        System.out.println("Car is stopped");
    }
}
