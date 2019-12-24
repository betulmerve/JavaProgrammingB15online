package day07;

public class Casting {

    public static void main(String[] args) {

        //int num=10;


        //int 10 is implicitly(automatically) converted to double 10.0
        double bigNum=10;

        System.out.println(bigNum);

        int num= (int) 12.99;
        System.out.println(num);
        // it is not rounded just take 12


        long earthToMoon=100000; //// behind scene it stored as 100000L
        System.out.println(earthToMoon);

        int earthToMoonIn_int = (int) earthToMoon;

        System.out.println(earthToMoonIn_int);


        double dinnerBill=26.36;
        int dinnerBillTip= (int) (dinnerBill)+5;

        System.out.println(dinnerBillTip);


    }
}
