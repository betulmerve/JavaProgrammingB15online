package day04;

import java.util.Scanner;

public class ScannerDeneme {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("What is your first name?");

        String firstName= scan.next();

        System.out.println("Your name is "+firstName);

        System.out.println("What is your age?");

        int age=scan.nextInt();

        System.out.println("Your age is "+age);

        System.out.println("Where are you from?");

        String city=scan.next();

        System.out.println("You are from "+city);

        System.out.println("Where are you living now?");

        String home=scan.next();

        System.out.println("You are living at "+home);


    }
}
