package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {

    public static void main(String[] args) {

        //int[] nums={13,31,8,5,21,2};
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(nums));

        //create a variable isSortedAlready and assign value of true;
        //and assume array is already sorted
        //and if it is not then change the value of isSortedAlready to false


        boolean isSortedAlready = true;

        for (int x = 0; x <= nums.length - 2; x++) {

            //System.out.println("is " + nums[x] + " less than " + nums[x + 1] + " ? :" + (nums[x] < nums[x + 1]));

            if (!(nums[x] < nums[x + 1])) {
                System.out.println("Array is not sorted!");
                isSortedAlready = false;
                break;
            }
        }

        if (isSortedAlready == true) {
            System.out.println("Array is sorted!");
        }

    }
}

