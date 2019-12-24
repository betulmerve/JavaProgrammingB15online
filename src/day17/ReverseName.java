package day17;

import java.util.Scanner;

public class ReverseName {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.nextLine();

        int x=name.length()-1;  //lastcharindex of your string

        while (x>=0) {

            System.out.println(name.charAt(x));
            --x;
        }

    }



}
