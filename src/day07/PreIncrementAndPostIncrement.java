package day07;

public class PreIncrementAndPostIncrement {

    public static void main(String[] args) {

        // pre-increment    ++score  or --score
        // post-increment       scote++ or score--

        int apple=8;
        apple++;

        System.out.println(apple);  //9
        System.out.println(++apple); //10
        System.out.println(apple++); //10 yaziyor ama apple i yukseltti sonrasinda 11e
        System.out.println(apple); //11



        int score=50;
        System.out.println(++score);  //51
        System.out.println(score++);  //51 yazacak ama 52 oldu
        System.out.println(score); //52
        System.out.println(--score); //51
        System.out.println(score--);  //51 yazacak ama 50 oldu
        System.out.println(score); //50

    }
}
