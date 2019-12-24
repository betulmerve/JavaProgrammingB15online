package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your current speed, dear driver?");

        int currentSpeed=scan.nextInt();

        System.out.println("What is the speed limit?");
        int speedLimit=scan.nextInt();

        if (currentSpeed>=speedLimit) {
            System.out.println("Pulled over by police");
            System.out.println("Get ticket");
        }  //there is no else, just move on!

        System.out.println("The end of the story");
    }
}
