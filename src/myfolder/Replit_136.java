package myfolder;

import java.util.Scanner;

public class Replit_136 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        boolean result=true;

        for (int x = 0; x < nums.length-1; x++) {

            if (nums[x]==5 && nums[x+1]==5) {
                result=true;
                break;
            } else {
               result=false;
            }

        }

        System.out.println(result);





    }
}
