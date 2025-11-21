public class Friend {
    String name;
    static int numOfFriends;

    Friend(String name){
        this.name = name;
        this.numOfFriends += 1;
    }

    static void displayFriends(){
        System.out.println("You have " + numOfFriends + " friends.");
    }

}
