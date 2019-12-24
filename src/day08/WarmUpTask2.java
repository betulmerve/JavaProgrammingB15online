package day08;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {


        /*
        guess your fav number
        variable  in myFavoruiteNumber
        ask user guess
        if right Bingo
        if wrong try again later
         */

        Scanner scan=new Scanner(System.in);

        int myFavouriteNumber=12;
        System.out.println("Guess my favourite number");
        int guessMyFavouriteNumber=scan.nextInt();

        if (myFavouriteNumber==guessMyFavouriteNumber) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Try again later");
        }




    }
}
