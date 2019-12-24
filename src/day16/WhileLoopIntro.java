package day16;

public class WhileLoopIntro {

    public static void main(String[] args) {

        //print hello world 5 times
        //also keep the count of how many times you said hello

        int count=1;
        System.out.println("Hello world");
        //count=count+1;
        //count+=1;
        ++count;
        System.out.println("Hello world");
        ++count;
        System.out.println("Hello world");
        ++count;
        System.out.println("Hello world");
        ++count;
        System.out.println("Hello world");

        System.out.println("Count is "+ count);

        System.out.println("--------------------------------");


        int cnt=1;
        while (cnt<=5) {
            System.out.println("Hello world");
            System.out.println("cnt value is "+cnt);
            ++cnt;
        }





    }
}
