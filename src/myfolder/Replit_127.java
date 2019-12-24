package myfolder;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_127 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int [] check=new int[]{0,0,0,0,0,0,0,0};


        for (int x = 0; x < inhabitants.length; x++) {


            System.out.println("Day "+x+" "+Arrays.toString(inhabitants));

            if (Arrays.equals(inhabitants,check)) {
                break;

            }

            for (int i = 0; i < inhabitants.length; i++) {

                inhabitants[i]=inhabitants[i]/2;
            }

        }

        System.out.println("---- EXTINCT ----");




    }
}
