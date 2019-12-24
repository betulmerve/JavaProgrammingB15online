package day20;

public class SumOfOddAndEven {

    public static void main(String[] args) {

        
        int sumOfOdd=0;
        int sumOfEven=0;

        for (int i = 10; i <=100 ; i++) {
            if(i%2==1) {
                //System.out.println(i);
                sumOfOdd=sumOfOdd+i;
            } else {
                //System.out.println(i);
                sumOfEven=sumOfEven+i;
            }
        }
        System.out.println("sum of odd: "+ sumOfOdd);
        System.out.println("sum of even: "+sumOfEven);
    }
}
//2530
//2475
