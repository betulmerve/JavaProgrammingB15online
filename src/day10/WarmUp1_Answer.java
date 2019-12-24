package day10;

public class WarmUp1_Answer {

    public static void main(String[] args) {

        String myAnswer="";
        int myNumber=15;

        if (myNumber%5==0) {
            myAnswer="Fizz Number";
        } else {
            myAnswer="Not a Fizz Number";
        }

        System.out.println("My number is "+myNumber+", it is "+myAnswer);
    }
}
