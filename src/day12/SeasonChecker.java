package day12;

import java.util.Scanner;

public class SeasonChecker {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String season;

        System.out.println("Enter your season please");

        season=scan.next();

        if (season.equalsIgnoreCase("spring")) {
            System.out.println("hiking, navruz, allergy");
        } else if (season.equalsIgnoreCase("winter")) {
            System.out.println("code!!!, ski, snowman");
        } else if (season.equalsIgnoreCase("fall")) {
            System.out.println("halloween, pumpkin ");
        } else if (season.equalsIgnoreCase("summer")) {
            System.out.println("swimming, ice cream,");
        } else {
            System.out.println("Not valid!");
        }
    }
}
