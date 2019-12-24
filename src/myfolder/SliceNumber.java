package myfolder;

import java.util.Scanner;

public class SliceNumber {

    public static void main(String[] args) {


        int num, digit1, digit2, digit3, digit4, digit5;

        Scanner scan=new Scanner(System.in);


        System.out.println("Enter your number:");
        num=scan.nextInt();

        System.out.println(num/10000);
        System.out.println((num%10000)/1000);
        System.out.println((num%1000)/100);
        System.out.println((num%100)/10);
        System.out.println(num%10);



    }
}
