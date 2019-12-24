package day15;

import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name=scan.next();

        //  if name less than 4  print short name
        // if name 5-10   print medium name
        // if more than 11 print long name

        if (name.length()<4 ) {
            System.out.println("Short name");
        } else if(name.length()>=5 && name.length()<=10 ) {
            System.out.println("Medium name");
        } else if(name.length() >=11) {
            System.out.println("Long name");
        }

         // ---------------------------------  //

        // check name contains a or e

        if(name.contains("a") || name.contains("e")) {
            System.out.println("name contains a or e");
        } else {
            System.out.println("i dont have a or e in my name");
        }




    }
}
