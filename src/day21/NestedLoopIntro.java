package day21;

public class NestedLoopIntro {

    public static void main(String[] args) {

        //count from 1 to 5, repeat 10 times

        for (int x = 1; x <=10 ; x++) {
            System.out.println("Iteration: "+x);

            for (int i = 1; i <=5 ; i++) {
                System.out.print(i+" ");

            }
            System.out.println();

        }

    }
}
