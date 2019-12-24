package day17;

public class WhileLoopPractice {

    public static void main(String[] args) {

        //count 1 to 5 and then count 5 to 1

        int count=1;

        while (count<=5) {
            System.out.print(count+" ");
            ++count;
        }
        System.out.println();
        System.out.println("Count = "+count);

        while (count>1) {  //>=1 demiyoruz cunku o zaman 0 da basiyor
            --count;
            System.out.print(count+" ");
        }
        System.out.println();
        System.out.println("Count = "+count);
    }
}
