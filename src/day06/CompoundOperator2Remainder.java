package day06;

public class CompoundOperator2Remainder {

    public static void main(String[] args) {

        int bankBalance=1140;
        System.out.println("I have spent half of it: "+bankBalance);

        //bankBalance=bankBalance/2;
        bankBalance /=2;

        System.out.println("Now i have "+bankBalance);

        // i want to divide my balance by 500 and keep the remainder in my pocket

        //bankBalance=bankBalance%500;
        bankBalance %=500;

        System.out.println("the remainder is: "+bankBalance);

    }
}
