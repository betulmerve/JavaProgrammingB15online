package day06;

public class CoinConverter {

    public static void main(String[] args) {

        //you have 2 dollar
        // how many quarter you can get 25 cents
        // how many dime you can get 10 cents
        // how many nickel you can get 5 cents
        // how many penny you can get 1 cent


        int cent=200;

        // you purchase candle for 74 cents,
        // what would be your remainder

        cent-=74;

        int quarter=cent/25;
        int penny=cent%25;

        System.out.println(quarter);
        System.out.println(penny);

        // i want to try to calculate dime for same money I got after purchase

        int dime=cent/10;
        int penny2=cent%10;

        System.out.println(dime);
        System.out.println(penny2);


        int nickel=cent/5;
        int penny3=cent%5;

        System.out.println(nickel);
        System.out.println(penny3);







    }
}
