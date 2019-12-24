package day06;

import java.util.Scanner;

public class HourMinuteConverter {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter minutes");
        int minute=scan.nextInt();
        int hour=minute/60;
        int remainder=minute%60;
        System.out.println("It is "+hour+" hour and " +remainder+ " minutes");

    }
}
