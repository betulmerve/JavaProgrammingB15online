package myfolder;

import java.util.Scanner;

public class Replit_161 {

    //BU SADECE 4 DIGIT ICIN OLDU!

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

        int digit1,digit2,digit3,digit4;

        digit1=num/1000;
        digit2=(num%1000)/100;
        digit3=(num%100)/10;
        digit4=num%10;



        if (digit1==digit4 && digit2==digit3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
