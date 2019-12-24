package day09;

import java.util.Scanner;

public class EvenOddFinder {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        int number;
        System.out.println("Please enter a number:");
        number=scan.nextInt();

        if (number%2==0) {
            System.out.println("it is even number");
        } else {
            System.out.println("it is odd number");
        }
    }
}
