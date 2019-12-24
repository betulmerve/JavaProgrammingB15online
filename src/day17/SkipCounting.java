package day17;

public class SkipCounting {

    public static void main(String[] args) {

        //skip counting by 3 from 0 till 30
        //3 6 9 12 15

        int count=0;

        while (count<=30) {

            System.out.println(count);
            // count=count+3
            count+=3;
        }


    }
}
