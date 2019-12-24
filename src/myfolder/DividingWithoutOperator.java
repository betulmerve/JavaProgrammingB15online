package myfolder;

import java.util.Scanner;

public class DividingWithoutOperator {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1st num");
        int num1=scan.nextInt();
        System.out.println("Enter 2nd num");
        int num2=scan.nextInt();

        int count=0;

        for (int i = num1; i >=num2 ; i=i-num2) {
            count++;
        }
        System.out.println(num1+ " divided by "+ num2+ " = "+count);
    }
}
