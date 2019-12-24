package day21;

public class OddNumberPrinter {

    public static void main(String[] args) {

                /*
        count from 1-10 --> print only odd number
        repeat this 4 times
         */

        for (int i = 1; i <=4 ; i++) {
            System.out.println("Iteration :"+i);

            for (int x = 1; x <=10 ; x++) {

                if(x%2==0) {
                    continue;
                }
                System.out.print(x+" ");
            }
            System.out.println();

        }
    }
}
