package myCodingBat;

import java.util.*;

public class Word0 {

    public static void main(String[] args) {


        System.out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"}));


    }
    public static Map<String, String> firstChar(String[] strings) {

        Map<String,String > myMap=new HashMap<>();

        for (String each:strings) {
            String firstChar=""+each.charAt(0);
            if (!myMap.containsKey(firstChar)) {
                myMap.put(firstChar,each);
            } else {
                myMap.put(firstChar,myMap.get(firstChar)+each);
            }

        }

        return myMap;

    }

    public String wordAppend(String[] strings) {

        Map<String,Integer> myMap=new HashMap<>();

        String result="";

        for (int x = 0; x < strings.length; x++) {
            String key=strings[x];

            if (myMap.containsKey(key)) {
                int value=myMap.get(key);
                value++;
                if (value%2==0) {
                    result=result+key;
                }
                myMap.put(key,value);


            } else {
                myMap.put(key,1);
            }
        }

        return result;

    }



}
/*

 */