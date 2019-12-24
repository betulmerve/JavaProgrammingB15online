package day05;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("How many days do you have?");
        int day=scan.nextInt();
        int minute=day*24*60;

        System.out.println("You have "+minute+" minutes.");
        System.out.println("How many minutes do you have?");

        minute=scan.nextInt();
        day=minute/(24*60);

        System.out.println("You have "+day +" days.");






    }
}
