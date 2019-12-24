package day26;

import java.util.Arrays;

public class ToCharArrayPracticeWithArraysClassMethod {

    public static void main(String[] args) {

        //print this array in alphabetic order

        String survey="Complete B15 Online 1 Month Survey";

        char[] surveyChars=survey.toCharArray();

        Arrays.sort(surveyChars);

        System.out.println(Arrays.toString(surveyChars));
    }
}
