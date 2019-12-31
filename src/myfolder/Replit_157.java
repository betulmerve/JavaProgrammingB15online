package myfolder;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_157 {

    //YAPAMADIM!

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] format1=s.split(":");
        System.out.println(Arrays.toString(format1));

        String amOrPm=format1[2].substring(2);
        System.out.println(amOrPm);

        if (amOrPm.equals("PM")) {
            format1[0]= Integer.toString(Integer.parseInt((format1[0]+12)));
        }

        String newFormat=format1[0]+":"+format1[1]+":"+format1[2].substring(0,2);
        System.out.println(newFormat);


    }
}
