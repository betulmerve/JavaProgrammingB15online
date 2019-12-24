package day12;

import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {

        String weather;
        Scanner scan=new Scanner(System.in);

        System.out.println("What is the weather like today?");
        weather=scan.next();

        if (weather.equals("Sunny")) {

            System.out.println("Code in sunny weather");
        } else if (weather.equals("Rainy")) {
            System.out.println("Code in rainy weather");
        } else if (weather.equals("Cloudy")) {
            System.out.println("Code in cloudy weather");
        }   else if (weather.equals("Snowy")) {
            System.out.println("Code in snowy weather");
        } else {
            System.out.println("Code anyway!");
        }
    }
}
