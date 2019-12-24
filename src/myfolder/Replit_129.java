package myfolder;

import java.util.Arrays;

public class Replit_129 {

    public static void main(String[] args) {

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

        int countOfE=0;

        for (String each:arr) {
            if (each.contains("e")) {
                countOfE++;
            }

        }


        String[] fewValues=new String[countOfE];

        int x=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains("e")) {
                fewValues[x]=arr[i];
                x++;
            }

        }



        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }
}
