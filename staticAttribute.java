public class staticAttribute {
    // static attribute is a class attribute
    // means it belongs to the class not to the object

    public static void main(String[] args){
        Friend f1 = new Friend("Suraj");
        Friend f2 = new Friend("Mayank");
        Friend f3 = new Friend("Sanket");

        System.out.println(Friend.numOfFriends); // accessing static attribute using class name
        Friend.displayFriends(); // accessing static method using class name

        // can also be accessed using object reference but not recommended
        // static attributes and methods are known with the help of class name

        System.out.println(f1.numOfFriends);
        f2.displayFriends();
    }
}
