package day17;

import java.util.Scanner;

public class WakeUp_NameCorrector {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String name;
        System.out.println("Please enter your name: ");
        name=scan.next();

        //get the first character make it uppercase
        //get the rest of the characters
        //then make it lower case
        //eventually concatenate them

        // iki yontem de olur
        //yontem 1

//        String nameFixed=(name.charAt(0)+"").toUpperCase();
//        nameFixed=nameFixed+name.substring(1).toLowerCase();
//        System.out.println("nameFixed = " + nameFixed);

        //yontem 2

        String nameFixed=name.toUpperCase().substring(0,1)+name.substring(1).toLowerCase();
        System.out.println("nameFixed = " + nameFixed);



    }
}
