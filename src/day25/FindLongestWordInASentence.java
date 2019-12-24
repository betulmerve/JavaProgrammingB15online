package day25;

import java.util.Arrays;

public class FindLongestWordInASentence {

    public static void main(String[] args) {

        String sentence="We are trying to find the longest word";

        String[] words=sentence.split(" ");

        System.out.println(Arrays.toString(words));


        String theLongestWord=words[0];

        for (String currentWord:words) {

            if (currentWord.length()>theLongestWord.length()) {
                theLongestWord=currentWord;
            }
        }

        System.out.println("The longest word is: "+theLongestWord);
        
    }
}
