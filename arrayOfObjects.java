public class arrayOfObjects {
    // creating array of objects

    public static void main(String[] args){

        // type 1
        // Hatti[] hattis = new Hatti[3];

        Hatti hatti1 = new Hatti("Fortuner", "Black");
        Hatti hatti2 = new Hatti("G-Wagon", "Black");
        
        // type 2
        // Hatti[] hattis = {hatti1, hatti2};

        // type 3 creating anonymous objects

        Hatti[] hattis = {new Hatti("Ghoda", "6300cc"), 
                        new Hatti("Bail", "4500cc")};

        // for(int i = 0; i < hattis.length; i++){
        //     hattis[i].drive();
        // }

        // enhanced for loop
        for(Hatti hatti : hattis){
            hatti.drive();
        }
    }
}
