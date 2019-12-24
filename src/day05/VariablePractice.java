package day05;

public class VariablePractice {
    public static void main(String[] args) {

        //8 primitive
        /*

        everything between will be comment
        whole number: byte, short, int, long
        fractional number: float, double
        logical: boolean (true false)
        character: char (single character single quote)

        default for whole: int
        default for fractional: double

        String is sequence of character not a primitive
         */

        //age calculator

        int birthYear=2001;
        int currentYear=2019;

        System.out.println("I was born in "+birthYear+" and i am "+(currentYear-birthYear)+" years old.");



        //task2, speed limit

        int speedLimit=65;
        int currentSpeed=95;
        int overTheLimit=currentSpeed-speedLimit;

        System.out.println("You are driving "+overTheLimit+" mph than speed limit!");
    }
}
