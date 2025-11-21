public class dog extends animal {
    String breed;

    dog(String breed){
        this.breed = breed;
    }

    void showBreed(){
        System.out.println("Dog Breed: " + breed);
    }

}
