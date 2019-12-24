package myfolder;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long num=1L;


        for (int i = n; i >=1 ; i--) {

            num=num*i;

            }
            System.out.println(num);
        }

        /*
        1!=1*1
        2!=2*1!
        3!=3*2!
        4!=4*3!

         */

    }

