package day12;

public class FizzBuzzNumberCheck {

    public static void main(String[] args) {

        int num=15;

        if (num%5==0 && num%3==0) {
            System.out.println("It is FizzBuzz Number");
        } else if (num%3==0) {
            System.out.println("It is Buzz Number");
        } else if (num%5==0) {
            System.out.println("It is Fizz Number");
        } else
            System.out.println("Not my number");
    }
}
