package myfolder;

import java.util.Scanner;

public class PrintTriangle {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        String star="*";
//
//
//            for ( j = 1; j <=n ; j++) {
//                System.out.println(star);
//                star=star+" *";
//            }


        for (i=1 ; i<=n; ++i) {
            System.out.print("*");
            for (j=1; j<i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
