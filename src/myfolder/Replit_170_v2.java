package myfolder;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_170_v2 {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int[] inhabitants = new int[8];
//        for (int i = 0; i < inhabitants.length; i++) {
//            inhabitants[i] = input.nextInt();
//        }


        int[] inhabitants ={3, 6, 0, 4, 3, 2, 7, 0};


        int day=0;
        int[] temp=new int[8];
        int[] zero={0,0,0,0,0,0,0,0};

        do{
            System.out.println("Day "+ day+ " "+ Arrays.toString(inhabitants));

            for (int x = 0; x < inhabitants.length; x++) {
                temp[x]=inhabitants[x];
            }

            for (int y = 0; y < inhabitants.length; y++) {

                if (y==0 && temp[0]==0) {
                    inhabitants[1]=temp[1]/2;
                } else if (y==7 && temp[7]==0) {
                    inhabitants[6]=temp[6]/2;
                } else if (temp[y]==0) {
                    inhabitants[y-1]=temp[y-1]/2;
                    inhabitants[y+1]=temp[y+1]/2;
                }

            }
            day++;

        }while(!Arrays.equals(inhabitants,zero));

        System.out.println("Day "+ day+ " "+ Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");





    }
}
