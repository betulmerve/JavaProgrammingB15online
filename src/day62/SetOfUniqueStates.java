package day62;

import java.util.*;

// Create a Set of String called states
// add bunch of states with some duplicate
// iterate over them using each and every way you know
public class SetOfUniqueStates {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));

        // any type of collection has size method to count the item
        System.out.println("How many ??  states.size() = " + states.size());

        //for each
        for (String each:states) {
            System.out.println("each = " + each);
        }

        // FOR LOOP DOES NOT WORK!!!! NO INDEX!!!!!!!!!
        // We can use iterator for any type of collection at all time

        //iterator
        Iterator<String> myIter=states.iterator();

        while (myIter.hasNext()) {
            System.out.println(myIter.next());
        }


        //lambda expression
//        states.forEach(each -> System.out.println("each state= " + each));

    }


}
