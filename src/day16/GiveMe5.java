package day16;

import java.util.Scanner;

public class GiveMe5 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        // i want to ask user enter the number
        //keep asking until user enter actually number 5

        int num=0;

        while (num!=5) {

            System.out.println("Give me fivee! ");
            num=scan.nextInt();
            //System.out.println("You entered "+ num);
        }

        System.out.println("End of program");
    }
}
