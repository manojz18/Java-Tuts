public class Hatti {
    String name;
    String color;

    // Constructor
    Hatti(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void drive(){
        System.out.println("Your drive " + color + " " + name);
    }
}
