package myfolder;

import java.util.Scanner;

public class ZombieAttackReplit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int day=0;

        while (inhabitants>0) {
            System.out.println("Day "+day+" ["+ inhabitants +"]");
            inhabitants=inhabitants/2;
            day++;
        }
        System.out.println("---- EXTINCT ----");


//        for (int i = 0; i <=100 ; i++) {
//
//            if(inhabitants<=0) {
//                break;
//            }
//            System.out.println("Day "+i+" ["+ inhabitants +"]");
//            inhabitants=inhabitants/2;
//
//        }
//        System.out.println("---- EXTINCT ----");



        /*
        example1- inhabitants is 6
Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----

example2- inhabitants is 0
---- EXTINCT ----

example3- inhabitants is 20
Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ----
         */




    }
}
