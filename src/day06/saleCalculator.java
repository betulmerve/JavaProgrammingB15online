package day06;

import java.util.Scanner;

public class saleCalculator {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("What is the regular price?");

        double regularPrice=scan.nextDouble();

        System.out.println("What is the discount percentage?");

        double discountPercentage=scan.nextDouble();

        double salePrice=regularPrice*(1-discountPercentage);

        System.out.println("Regular price is "+regularPrice+"$, discount is "+discountPercentage+" and you got deal for "+salePrice+"$.");

    }
}
