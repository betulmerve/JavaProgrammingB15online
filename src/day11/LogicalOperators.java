package day11;

public class LogicalOperators {
    public static void main(String[] args) {

        // in mat 60<x<100
        // in Java x>60 && x<100

        // double ampersand && and single ampersand &  -->> logical AND operator
        //  || 2 pipe  or  | 1 pipe --->> logical OR operator


        System.out.println("The Truth Table &&");
        System.out.println("The result of true&&true is "+(true&&true));
        System.out.println("The result of true&&false is "+(true&&false));
        System.out.println("The result of false&&true is "+(false&&true));
        System.out.println("The result of false&&false is "+(false&&false));

        System.out.println("The Truth Table ||");
        System.out.println("The result of true||true is "+(true||true));
        System.out.println("The result of true||false is "+(true||false));
        System.out.println("The result of false||true is "+(false||true));
        System.out.println("The result of false||false is "+(false||false));

        int num=5;
        System.out.println(num<10 || num>100);
        System.out.println(num >10 && num<60);

        // more than 2 conditions at the same time

        System.out.println(true||false||false);
        System.out.println(true&&true&&false);


        int x=55;
        System.out.println(x==50 || x==51 || x==55);
        System.out.println(x>50 && x!=52 || x==57);



    }
}
