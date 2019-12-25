package day33;

import javax.swing.*;
import java.util.Scanner;

public class ReturnWillTerminateTheMethod {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number more than 10:");
        int num=scan.nextInt();

        if (num<10) {
            //you can use return keyword to get out of the method

            return;
        }

        System.out.println("Happy holidays!");
        System.out.println("2 days off! yeeaay!");
    }
}
