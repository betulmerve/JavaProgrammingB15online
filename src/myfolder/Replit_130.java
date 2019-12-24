package myfolder;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_130 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }

        //System.out.println(Arrays.toString(nums));

////               0 1 2 3
//        int[] n={1,2,3,4};
//        int[] y={2,3,4,1};
////               0 1 2 3

        int[] numsNew=new int[size];

        for (int i = 0; i <= size-2; i++) {
            numsNew[i]=nums[i+1];

        }

        numsNew[size-1]=nums[0];

        System.out.println(Arrays.toString(numsNew));

//        numsNew[0]=nums[1];
//        numsNew[1]=nums[2];
//        numsNew[2]=nums[3];
//        numsNew[3]=nums[0];


    }
}
