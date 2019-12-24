package day09;

import java.util.Scanner;

public class LanguagePicker {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int num;
        String greeting="";
        System.out.println("Welcome to Cybertek Call Center");
        System.out.println("Please select your language option from 1-7");
        num=scan.nextInt();

        if (num==1) {
            greeting="Hello";
        } else if (num==2) {
            greeting="Salam";
        } else if (num==3) {
            greeting="Merhaba";
        } else if (num==4) {
            greeting="Hola";
        } else if (num==5) {
            greeting="Szia";
        } else if (num==6) {
            greeting="Bonjour";
        } else if (num==7) {
            greeting="Privet";
        }

        greeting=greeting+", SDET";

        System.out.println("This is how the greeting message you get: "+greeting);

    }
}
