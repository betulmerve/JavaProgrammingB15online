package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {

        //ask user for name "your name is"
        //ask user for birth year "your age is"
        //ask user for height "your height is"

        Scanner in=new Scanner(System.in);

        System.out.println("What is your name: ");
        String name=in.next();
        System.out.println("Your name is "+name);
        System.out.println("What is your birth year: ");
        int birthYear=in.nextInt();
        int currentYear=2019;
        System.out.println("Your age is "+(currentYear-birthYear));
        System.out.println("What is your height: ");
        double height=in.nextDouble();
        System.out.println("Your height is "+height+" inches.");
    }
}
