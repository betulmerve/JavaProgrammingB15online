package exercisesFromBook;

import java.util.Scanner;

public class LoopChapter4 {

    public static void main(String[] args) {

        /*
        imagine a program that reads the population of a city using the following
        statements:
        System.out.print("Enter the population of the city: ");
        int population = keyboard.nextInt( );
        Write a while loop after these statements that ensures that population is
        positive. if the user enters a population that is either negative or zero, ask
        the user to enter a nonnegative value.
         */
//
//        Scanner keyboard=new Scanner(System.in);
//        System.out.print("Enter the population of the city: ");
//        int population = keyboard.nextInt( );
//        while (population<=0) {
//            System.out.print("Enter a non-negative value: ");
//            population = keyboard.nextInt( );
//        }


        /*
        imagine that you have won a $100 gift certificate in a contest. You must spend
        the money in a particular store, but you can buy at most only three items.
        The store’s computer tracks the amount of money you have left to spend as
        well as the number of items you have bought. Each time you choose an item,
        the computer will tell you whether you can buy it. Although we have chosen
        small numbers for our example, we want to write a program for the computer
        so that both the dollar amount available and the number of items you can
        buy are easily changed.
         */

        Scanner scan = new Scanner(System.in);
        int giftCard = 100;
        //int numberOfItemsBuyed=0;
        int remaining = 100;
        int itemNumber = 1;
        int totalSpend = 0;

        System.out.println("Hi! you have $100 gift card! Enjoy! You can buy 3 items with that!");

        while (remaining > 0 && itemNumber <= 3) {

            System.out.println("You may buy up to " +
                    (3 - itemNumber + 1) +
                    " items");
            System.out.println("costing no more than $" +
                    remaining + ".");
            System.out.print("Enter cost of item #" +
                    itemNumber + ": $");
            int priceOfProduct = scan.nextInt();
            if (priceOfProduct <= remaining) {
                System.out.println("You can buy this product");
                totalSpend = totalSpend + priceOfProduct;
                remaining = remaining - priceOfProduct;

                if (remaining > 0) {
                    itemNumber++;
                } else {
                    System.out.println("you are out of money!");
                }
            } else {
                System.out.println("you can not buy this product");
                break;
            }

        }

        System.out.println( "You spend $"+totalSpend +
                " you have "+ remaining +" in your giftcard left");
    }
}

