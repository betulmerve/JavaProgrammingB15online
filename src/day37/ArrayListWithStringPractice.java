package day37;

import java.util.ArrayList;
import java.util.Arrays;
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




        //        // Do we have superman in the list ?
//        System.out.println("superHeros.contains(\"Superman\") = "
//                            + superHeros.contains("Superman"));
//
//        // does this this contains an item with exact value of man
//        System.out.println("superHeros.contains(\"man\") = "
//                            + superHeros.contains("man"));

        List<String> superHeroCopy=new ArrayList<>(superHeros);
        System.out.println("superHeroCopy = " + superHeroCopy);

        //THIS WILL CREATE A UNMODIFIABLE LIST!
        List<String> topics= Arrays.asList("Java","Selenium","Database","API");
        System.out.println("topics = " + topics);

        //HERE COPYING EVERYTHING INSIDE topic to topicCopy
        //and it is just regular ArrayList, we can do anything
        List<String> topicsCopy=new ArrayList<>(topics);
        System.out.println("topicsCopy = " + topicsCopy);

    }
}
