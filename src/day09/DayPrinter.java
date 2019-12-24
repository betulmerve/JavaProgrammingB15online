package day09;

import java.util.Scanner;

public class DayPrinter {

    public static void main(String[] args) {

        int dayCode;

        Scanner scan= new Scanner(System.in);
        System.out.println("What is the day code?");
        dayCode=scan.nextInt();


        if (dayCode==1) {
            System.out.println("It is Monday!");
        } else if (dayCode==2) {
            System.out.println("It is Tuesday!");
        } else if (dayCode==3) {
            System.out.println("It is Wednesday!");
        } else if (dayCode==4) {
            System.out.println("It is Thursday!");
        } else if (dayCode==5) {
            System.out.println("It is Friday!");
        } else if (dayCode==6) {
            System.out.println("It is Saturday!");
        } else if (dayCode==7) {
            System.out.println("It is Sunday!");
        } else {
            System.out.println("Day is unknown!");
        }
    }
}
