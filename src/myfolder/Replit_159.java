package myfolder;

import java.util.Scanner;

public class Replit_159 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for (int x = 0; x < nums.length; x++) {
            int count=0;
            for (int y = 0; y < nums.length; y++) {

                if (nums[x]==nums[y]) {
                    count++;
                }
            }
            if (count==1) {
                System.out.println(nums[x]);
            }
        }

    }
}
