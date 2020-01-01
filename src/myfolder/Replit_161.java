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

//       String strNum= String.valueOf(num);
//
//       String palindrome="";
//        for (int x = strNum.length()-1; x >=0; x--) {
//            palindrome=palindrome+strNum.charAt(x);
//
//        }
//
//        if (strNum.equals(palindrome)) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

        int reversed=0;
        int numo=num;
        while (num>0){
            reversed=reversed*10+num%10;
            num/=10;
        }
        System.out.println(reversed==numo);

    }
}
