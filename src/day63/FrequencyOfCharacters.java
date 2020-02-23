package day63;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        // Get the frequency and store into map   <Character, Integer>
        // if we do not have the character
        // we will enter character in char column
        // and enter the count as 1

        // if we have the character
        // increase the existing count by 1
        // and replace the value with new value
//        String str = "AAABBBBBBACCRDDD";

//        Map<Character,Integer> charFrequencyMap=new HashMap<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            char currentChar=str.charAt(i);
//
//            if (!charFrequencyMap.containsKey(currentChar)) {
//                System.out.println("Entering for the first time "+currentChar);
//                charFrequencyMap.put(currentChar,1);
//            } else {
//                System.out.println("Incrementing the count of " + currentChar + " by one and " +
//                        "replacing old count " + charFrequencyMap.get(currentChar));
//                charFrequencyMap.replace(currentChar,charFrequencyMap.get(currentChar)+1);
//            }
//
//        }
//
//        System.out.println("charFrequencyMap = " + charFrequencyMap);

        String str = "AAABBBBBBACCRDDD";
        Map<Character,Integer> charFreqMap=new HashMap<>();

        for (int x = 0; x < str.length(); x++) {
            char currentChar=str.charAt(x);
            if (!charFreqMap.containsKey(currentChar)) {
                System.out.println("Entering the map for first time "+ currentChar);
                charFreqMap.put(currentChar,1);
            } else {
                System.out.println("Incrementing the count of "+ currentChar + " by one and replacing old count "+
                        charFreqMap.get(currentChar));
                charFreqMap.put(currentChar,charFreqMap.get(currentChar)+1);
            }

        }
        System.out.println("charFreqMap = " + charFreqMap);



    }
}
