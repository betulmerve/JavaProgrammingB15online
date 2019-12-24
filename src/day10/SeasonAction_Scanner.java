package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {
    public static void main(String[] args) {

        /*
        Spring   Hike, Easter, Nawruz, Blossom
        Summer   Swim, vacation, BBQ, holiday
        Fall     Black friday, hiking, harvest, halloween, shopping
        Winter   snowboarding, ski, christmas, new year
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Hey what is the reason?");


        String season;
        season=scan.next();

        switch (season){
            case "Spring":
                System.out.println("Hike, Easter, Nawruz, Blossom");
                break;
            case "Summer":
                System.out.println("Swim, vacation, BBQ, holiday");
                break;
            case "Fall":
                System.out.println("Black friday, hiking, harvest, halloween, shopping");
                break;
            case "Winter":
                System.out.println("snowboarding, ski, christmas, new year");
                break;
            default:
                System.out.println("It is unknown");


        }
    }
}
