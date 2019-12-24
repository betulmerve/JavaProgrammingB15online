package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {

    public static void main(String[] args) {

        //limit means:how many pieces do you want?

        String sentence="I love Java Java Java";

        String[] wordsArray1=sentence.split(" ");
        String[] wordsArray2=sentence.split(" ",1);
        String[] wordsArray3=sentence.split(" ",2);
        String[] wordsArray4=sentence.split(" ",3);
        String[] wordsArray5=sentence.split(" ",4);
        String[] wordsArray6=sentence.split(" ",5);
        String[] wordsArray7=sentence.split(" ",6);



        System.out.println(Arrays.toString(wordsArray1));
        System.out.println(Arrays.toString(wordsArray2));
        System.out.println(Arrays.toString(wordsArray3));
        System.out.println(Arrays.toString(wordsArray4));
        System.out.println(Arrays.toString(wordsArray5));
        System.out.println(Arrays.toString(wordsArray6));
        System.out.println(Arrays.toString(wordsArray7));


    }
}
