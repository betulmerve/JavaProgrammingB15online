package day17;

public class FizzBuzzTest {

    public static void main(String[] args) {

        // if a number can be divided by both 3 and 5 it is a Fizz Buzz number
        //if a number can be divided by 5 a Fizz number
        //if a number can be divided by 3 a Buzz number

        int num=1;

        while (num<=100) {
            if(num%3==0 && num%5==0) {
                System.out.println(num+ " is Fizz Buzz Number");
            } else if(num%5==0) {
                System.out.println(num+ " is Fizz Number");
            } else if(num%3==0) {
                System.out.println(num+ " is Buzz Number");
            }
            ++num;
        }
    }
}
