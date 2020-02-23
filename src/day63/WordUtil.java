package day63;

import java.util.HashMap;
import java.util.Map;

public class WordUtil {

    public static void main(String[] args) {

        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";
        System.out.println("getFrequencyMap(str) = " + getFrequencyMap(str));
    }

    // WHY THIS IS STATIC ? SO I CAN CALL IT DIRECTLY IN MAIN TO TEST
    // CAN I NOT MAKE IT STATIC ? YES YOU CAN , THEN YOU WILL HAVE TO CREATE OBJECT THEN CALL IT
    // CAN IT BE VOID ? YES YOU CAN USE VOID IF THAT'S WHAT YOU WANT
    // BUT HERE REQUIREMENT IS getFrequencyMap AND RETURN IT TO THE CALLER ,

    public static Map<String,Integer> getFrequencyMap(String str) {
        String[] arr=str.split(" ");
        Map<String,Integer> stringIntegerMap=new HashMap<>();

        for (String each:arr) {
            if (!stringIntegerMap.containsKey(each)) {
                stringIntegerMap.put(each,1);
            } else {
                stringIntegerMap.put(each,stringIntegerMap.get(each)+1);
            }
        }
        return stringIntegerMap;
    }
}
