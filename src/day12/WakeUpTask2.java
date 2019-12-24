package day12;

import java.util.Scanner;

public class WakeUpTask2 {

    public static void main(String[] args) {

        int month;

        Scanner scan=new Scanner(System.in);
        System.out.println("Month number?");
        month=scan.nextInt();

        if (month<1 || month>12) {
            System.out.println("Invalid Month!");
        } else if (month>=3 && month<=5) {
            System.out.println("It's spring");
        } else if (month>=6 && month<=8) {
            System.out.println("It is summer");
        } else if (month>=9 && month<=11) {
            System.out.println("It is fall");
        } else if (month==12 || month==1 || month==2) {
            System.out.println("It is winter!");
        }
    }
}
