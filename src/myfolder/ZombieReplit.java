package myfolder;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieReplit {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int[] inhabitants = new int[8];
//        for(int i=0; i<inhabitants.length; i++) {
//            inhabitants[i] = input.nextInt();
//        }

        int[] inhabitants={3,6,0,4,3,2,7,0};

        for (int x = 0; x < inhabitants.length; x++) {
            if (inhabitants[x]==0){
                inhabitants[x-1]=inhabitants[x-1]/2;
                //inhabitants[x+1]=inhabitants[x+1]/2;
                System.out.println(Arrays.toString(inhabitants));
            }

        }


//        for (int x = 0; x < inhabitants.length; x++) {
//            for (int y = 0; y < inhabitants.length; y++) {
//                if (inhabitants[x]==0) {
//                    inhabitants[x-1]=inhabitants[x-1]/2;
//                    inhabitants[x+1]=inhabitants[x+1]/2;
//                }
//            }
//            System.out.println(Arrays.toString(inhabitants));
//        }


    }
}
