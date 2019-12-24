package day07;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        String firstName, lastName, company;
        System.out.println("What is your first name?");
        firstName=scan.next();
        System.out.println("What is your last name?");
        lastName=scan.next();
        System.out.println("Which company are you working for?");
        company=scan.next();
        String email=firstName+"_"+lastName+"@"+company+".com";

        System.out.println("My name is " + firstName+" "+lastName+
                " and i work for "+company+" and my mail is "+email);




    }
}
