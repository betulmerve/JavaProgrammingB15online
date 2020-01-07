package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithStringPractice {

    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg"); // when we remove Cyborg , Flash become the item at index 2
        superHeros.add("Flash");
        superHeros.add("Aquaman");
        superHeros.add("Wonder Woman");

        System.out.println("superHeros = " + superHeros);
        // remove any heros that does not have man in the String


        for (int x = 0; x < superHeros.size(); x++) {
            if (!superHeros.get(x).contains("man")) {
                superHeros.remove(superHeros.get(x));
                x=x-1;  //prevent shifting index
            }
        }

        // take away from here :
        //  removing item during the for loop
        //  when you remove 1 item , you will have one less item in the list
        //  everything after the removed item will move to one index to the left
        //  so in order not to miss the item right after the removed item
        //  we need to decrease the index by one to stay at same index after removing

        System.out.println("After remove =" +superHeros);


    }
}
