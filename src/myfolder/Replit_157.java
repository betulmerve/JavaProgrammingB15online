package myfolder;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_157 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] format1=s.split(":");
        //System.out.println(Arrays.toString(format1));

        String amOrPm=format1[2].substring(2);
        //System.out.println(amOrPm);

        int hour=0;

        if (amOrPm.equals("PM")) {
            hour=Integer.parseInt(format1[0])+12;
            String strHour=String.valueOf(hour);
            String newFormat=strHour+":"+format1[1]+":"+format1[2].substring(0,2);
            System.out.println(newFormat);

        } else {
            String newFormat=format1[0]+":"+format1[1]+":"+format1[2].substring(0,2);
            System.out.println(newFormat);

        }

//        String strHour=String.valueOf(hour);
//
//        String newFormat=strHour+":"+format1[1]+":"+format1[2].substring(0,2);
//        System.out.println(newFormat);


    }
}
