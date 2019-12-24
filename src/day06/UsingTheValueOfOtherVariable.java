package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariable {

    public static void main(String[] args) {

        int myFavoriteNumber=300;
        int yourFavoriteNumber=myFavoriteNumber;

        System.out.println("My favorite number "+myFavoriteNumber);
        System.out.println("Your favorite number " +yourFavoriteNumber);

        yourFavoriteNumber=100;

        System.out.println("My favorite number "+myFavoriteNumber);
        System.out.println("Your favorite number " +yourFavoriteNumber);

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your order? ");
        String yourOrder=scan.nextLine();
        String myOrder=yourOrder;

        System.out.println("Your order is "+yourOrder+"\n"+"My order is "+myOrder);



    }
}
