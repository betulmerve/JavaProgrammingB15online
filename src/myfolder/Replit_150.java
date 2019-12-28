package myfolder;

import java.util.Scanner;

public class Replit_150 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);
        //printHollowRect();
    }

    /*
    5 defa tekrar et

   eger 1 ise 5 yildiz bas
   eger 5 ise 5 yildiz bas
   else 1 yildiz 3 bosluk 1 yildiz
     */
    public static void printHollowRect() {
        for (int x = 1; x <=5 ; x++) {

            if (x==1 || x==5) {
                String star="";
                for (int y = 1; y <=5 ; y++) {
                    star=star+"*";
                }
                System.out.println(star);
            } else {
                System.out.println("*   *");
            }

        }
    }

    public static void sign(int n) {

        if (n==0) {
            System.out.println("0");
        } else if (n>0) {
            System.out.println("1");
        } else if (n<0) {
            System.out.println("-1");
        }

    }
}


