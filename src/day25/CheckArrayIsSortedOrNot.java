package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

        int[] nums={13,31,8,5,21,2};
        System.out.println(Arrays.toString(nums));
        int numsItemCount =nums.length;
        //I want to copy the content of nums array into the new array

        int[] numsCopy=new int[numsItemCount];
//        numsCopy[0]=nums[0];
//        numsCopy[1]=nums[1];
//        numsCopy[2]=nums[2];
//        numsCopy[3]=nums[3];
//        numsCopy[4]=nums[4];
//        numsCopy[5]=nums[5];
//        System.out.println(Arrays.toString(numsCopy));

        for (int x = 0; x <=nums.length-1 ; x++) {
            numsCopy[x]=nums[x];
        }
        System.out.println("Before sort:"+Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);

        System.out.println("After sort:"+Arrays.toString(numsCopy));

        //check it is sorted or not

        if(Arrays.equals(nums,numsCopy)) {
            System.out.println("This array is already sorted!");
        } else {
            System.out.println("This array is not already sorted");
        }

        //plain english is
        //copy this numbers in another container
        //sort the number and check
        //whether it is still has same order as original number
        //why did we copy?
        //because if we sorted directly we will lose the original order
        //and there will be nothing to compare with




    }
}
