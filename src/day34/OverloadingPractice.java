package day34;

public class OverloadingPractice {

    public static void main(String[] args) {

        /*
        Method Overloading is a feature that allows a class to have more than one method
        having the same name, if their argument lists are different.

         */

        add(5);
        add(5,10);
        add(6L,7L);
        add(4,5,6);
    }



    public static void add(int num1,int num2) {
        System.out.println("Sum is :"+ (num1+num2));
    }

    public static void add(int num) {
        System.out.println("Result is: "+(num+100));
        //add(num,100);  we can do this to reuse functionality we already have
    }

    public static void add(int num1, int num2, int num3) {
        System.out.println("Sum is :" +(num1+num2+num3));
    }
    public static void add(long num1, long num2) {
        System.out.println("Sum is :"+ (num1+num2));
    }
}

