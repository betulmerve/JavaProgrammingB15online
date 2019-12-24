package day18;

import java.util.Scanner;

public class GiveMe5$Or20$ {

    public static void main(String[] args) {

        //keep asking for 5$ or 20$ until you get them

        Scanner scan=new Scanner(System.in);
        System.out.println("Give me 5$ or 20$!");
        int x=scan.nextInt();
        //if the bill is not 5 and not 20
        //or negate the result of it is 5 or 20
        //  while (!(x==5 || x==20))
        while (x!=5 && x!=20) {

            System.out.println("it is not what i am looking for");
            System.out.println("Give me 5$ or 20$");
            x=scan.nextInt();
        }
        System.out.println("The happy ending!Got the money!");


    }
}
