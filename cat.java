public class cat extends animal {
    String catColor;

    cat(String catColor){
        this.catColor = catColor;
    }

    void showCatColor(){
        System.out.println("Cat Color: " + catColor);
    }
}
