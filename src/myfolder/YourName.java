package myfolder;

import java.util.Arrays;
import java.util.Scanner;

public class YourName {

    public static void main(String[] args) {


        String name="Merve";

        char[] myName=name.toCharArray();

//        for (char eachLetter:myName) {
//
//            System.out.println(eachLetter);
//
//        }

        for (int x = 0; x <=myName.length-1 ; x++) {

            System.out.println("Index "+x+": "+myName[x]);
        }

        int countOfE=0;
        for (int x = 0; x <=myName.length-1 ; x++) {

            if (myName[x]=='e' || myName[x]=='E') {
                countOfE++;
            }
        }
        System.out.println("Count of e/E is: "+countOfE);



    }
}
