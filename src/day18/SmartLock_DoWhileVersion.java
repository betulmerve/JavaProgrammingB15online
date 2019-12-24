package day18;

import java.util.Scanner;

public class SmartLock_DoWhileVersion {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String password="";
        System.out.println("Knock knock!");



        do {
            System.out.println("What is your password?");
            password=scan.next();

        } while (!password.equals("B15")) ;

        System.out.println("Open sesame!");
    }
}
