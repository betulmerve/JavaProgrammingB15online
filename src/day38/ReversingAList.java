package day38;

import java.util.*;

public class ReversingAList {

    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200, 100, 700, 400, 500));
        System.out.println("nums1 before reversing = " + nums1);

        // 200, 100, 700, 400, 500
        // after reversing
        // 500 ,400 , 700, 100, 200

        Collections.reverse(nums1);
        System.out.println("nums1 = " + nums1);

        //sorting in reverse order
        //high to low
        //700,500,400,200,100

        Collections.sort(nums1, Comparator.reverseOrder());
        System.out.println("nums1 = " + nums1);





    }
}
