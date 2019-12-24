package day17;

import java.util.Scanner;

public class FullNameCorrector {

    public static void main(String[] args) {

        String fullName="";

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your full name in 2 words: ");
        fullName=scan.nextLine();


        int firstSpace=fullName.indexOf(" ");
        String firstName=fullName.substring(0,firstSpace);
        String firstNameFixed=firstName.substring(0,1).toUpperCase();
        firstNameFixed=firstNameFixed+firstName.substring(1).toLowerCase();
        String lastName=fullName.substring(firstSpace+1);
        String lastNameFixed=lastName.substring(0,1).toUpperCase();
        lastNameFixed=lastNameFixed+lastName.substring(1).toLowerCase();

        System.out.println("Your fixed full name is "+firstNameFixed+" "+lastNameFixed);

    }
}
