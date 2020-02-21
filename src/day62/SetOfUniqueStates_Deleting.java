package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Create a Set of String called states
// add bunch of states with some duplicate
// iterate over them using each and every way you know
public class SetOfUniqueStates_Deleting {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before= " + states);
//        states.remove("GA");
//        System.out.println("states after= " + states);

        //remove all the items that contains A
       Iterator<String> myIter=states.iterator();
        // Iterator has 3 methods hasNext() next() remove() works together
        // to remove item while iterating over a collection


        while (myIter.hasNext()) {

            // PLEASE DO NOT CALL NEXT METHOD TWICE IN ONE ITERATION OR IT WILL SKIP TO NEXT ITEM
            if (myIter.next().contains("A")) {
//                System.out.println("removing = " + stIter.next());
                myIter.remove();
            }

        }
        System.out.println("states without A   = " + states);
//
//        while (myIter.hasNext()) {
//           String each=myIter.next();
//           if (each.contains("A")) {
//               myIter.remove();
//           }
//       }
//        System.out.println("states without A = " + states);


        // IF YOU TRY TO GET THE NEXT ITEM THAT YOU DO NOT HAVE USING ITERATOR
        // YOU WILL GET NoSuchElementException
//        System.out.println("stIter.next() = " + stIter.next());


//        // The Lambda expression way of removing
//        states.removeIf( each -> each.contains("A")  );
//        System.out.println("states after   = " + states);



    }
}
