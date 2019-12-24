package day18;

import java.util.Scanner;

public class SmartLockOpener {

    public static void main(String[] args) {

        //smart lock door has password
        //unless you enter correct password
        //it keep locking you out
        //assuming correct password is B15
        //keep asking until user enter correct one

        Scanner scan=new Scanner(System.in);
        System.out.println("Knock knock!");
        System.out.println("What is the password?");

        String password=scan.next();


        while (!password.equals("B15")) {
            System.out.println("Wrong password, try again!");
            password=scan.next();
        }
        System.out.println("Yaaay! Open Sesame!");

    }
}
