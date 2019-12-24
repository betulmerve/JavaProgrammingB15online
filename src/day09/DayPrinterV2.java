package day09;

import java.util.Scanner;

public class DayPrinterV2 {

    public static void main(String[] args) {

        int dayCode=6;
        String dayName=""; //assigning the empty String value

        //Scanner scan= new Scanner(System.in);
        //System.out.println("What is the day code?");
        //dayCode=scan.nextInt();


        if (dayCode==1) {
            dayName="Monday";
        } else if (dayCode==2) {
            dayName="Tuesday";
        } else if (dayCode==3) {
            dayName="Wednesday";
        } else if (dayCode==4) {
            dayName="Thursday";
        } else if (dayCode==5) {
            dayName="Friday";
        } else if (dayCode==6) {
            dayName="Saturday";
        } else if (dayCode==7) {
            dayName="Sunday";
        } else {
            dayName="UNKNOWN!";
        }
        System.out.println("Day is "+dayName);
    }
}
