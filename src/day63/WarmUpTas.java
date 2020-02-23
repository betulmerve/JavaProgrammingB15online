package day63;

import java.util.*;
/*
Please convert array to list and remove 20 and 45 using iterator.
Task 2 - Then remove all odd numbers.
int[] nums = {20, 45, 78, 98, 33, 56, 20, 27, 45, 98, 74, 36, 99 20, 45, 21};
 */

public class WarmUpTas {
    public static void main(String[] args) {

        int[] nums = {20, 45, 78, 98, 33, 56, 20, 27, 45, 98, 74, 36, 99, 20, 45, 21};
        List<Integer> numList= new ArrayList<>();

        for (int x = 0; x < nums.length; x++) {

            numList.add(nums[x]);

        }
        System.out.println("numList = " + numList);


        for(Iterator<Integer> numRemove = numList.iterator(); numRemove.hasNext();){
            int x = numRemove.next();
            if(x==20 || x==45) {
                numRemove.remove();
            }
        }

        System.out.println("numList = " + numList);

//        Iterator<Integer> myIter=numList.iterator();
//        while (myIter.hasNext()) {
//            if (myIter.next()%2==1) {
//                myIter.remove();
//            }
//        }

    }
}

