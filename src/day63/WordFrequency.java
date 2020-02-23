package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {

        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";

        String[] arr=str.split(" ");
        Map<String,Integer> stringIntegerMap=new HashMap<>();

        for (int x = 0; x < arr.length; x++) {
            String currentWord=arr[x];
            if (!stringIntegerMap.containsKey(currentWord)) {
                System.out.println("Entering first time "+ currentWord);
                stringIntegerMap.put(currentWord,1);
            } else {
                System.out.println("Increment the count of word "+ currentWord);
                stringIntegerMap.put(currentWord,stringIntegerMap.get(currentWord)+1);
            }
        }
        System.out.println("stringIntegerMap = " + stringIntegerMap);
    }
}
