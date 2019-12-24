package day20;

public class SumOfOdd {

    public static void main(String[] args) {

        //give me sum of odd numbers from 10 to 100
        int sumOfOdd=0;


        for (int i = 10; i <=100 ; i++) {
            if(i%2==1) {
                System.out.println(i);
                sumOfOdd=sumOfOdd+i;
            }
        }
        System.out.println("sum of odd: "+ sumOfOdd);

    }
}

