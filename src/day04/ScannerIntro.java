package day04;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        //I want to save users input after asking some questions
        //and I want to save this input so i can do smth with it

        Scanner scan= new Scanner(System.in);

        // ask user to enter name

        System.out.println("Enter your first name please ");
        //capture what user type on keyboard in console for name

        String firstName =scan.next();

        //print to result of what we saved from users input

        System.out.println("You have entered: "+firstName);

        //capture what user type on keyboard in console for age
        System.out.println("Enter your age please ");

        int age=scan.nextInt();

        System.out.println("Your age is : "+age);




    }

}
