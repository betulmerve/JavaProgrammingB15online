package java_interview_coding_tasks;

import java.util.Arrays;

public class String_SameLetters {

    /*
    Write a return method that check if a string is build out of the same letters as another string.

    Ex:  same("abc",  "cab"); -> true

    same("abc",  "abb"); -> false:
     */
    public static void main(String[] args) {

        System.out.println(sameLetters("abc","cab"));
        System.out.println(sameLetters("abc","abb"));


    }

    public static boolean sameLetters(String str1, String str2) {
        char[] ar1=str1.toCharArray();
        Arrays.sort(ar1);
        char[] ar2=str2.toCharArray();
        Arrays.sort(ar2);


        if (Arrays.equals(ar1,ar2)) {
            return true;
        } else {
            return false;
        }
    }
}
