package day05;

import java.util.Scanner;

public class GroceryActions {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("What is the price of tomato?");
        double tomato=scan.nextDouble();
        System.out.println("How many tomato do you want?");
        int countTomato=scan.nextInt();
        System.out.println("What is the price of potato?");
        double potato=scan.nextDouble();
        System.out.println("How many potato do you want?");
        int countPotato=scan.nextInt();
        System.out.println("What is the price of banana?");
        double banana=scan.nextDouble();
        System.out.println("How many banana do you want?");
        int countBanana=scan.nextInt();

        System.out.println("You got "+countTomato+" tomatoes and your total price is "+(countTomato*tomato));
        System.out.println("You got "+countPotato+" potatoes and your total price is "+(countPotato*potato));
        System.out.println("You got "+countBanana+" bananas and your total price is "+(countBanana*banana));



    }
}
