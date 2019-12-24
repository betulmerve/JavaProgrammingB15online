package day09;

import java.util.Scanner;

public class LanguagePicker_WithSwitchStatement {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int num;
        String greeting="";
        System.out.println("Welcome to Cybertek Call Center");
        System.out.println("Please select your language option from 10-16");
        num=scan.nextInt();

        switch (num) {
            case 10:
                greeting="Hello";
                break;
            case 11:
                greeting="Salam";
                break;
            case 12:
                greeting="Merhaba";
                break;
            case 13:
                greeting="Privet";
                break;
            case 14:
                greeting="Hola";
                break;
            case 15:
                greeting="Szia";
                break;
            case 16:
                greeting="Bonjour";
                break;
            case 17:
                greeting="Hello";
                break;
            default:
                greeting="Unknown";
        }

        greeting=greeting+", SDET";

        System.out.println("This is how the greeting message you get: "+greeting);




    }
}
