package day32;

import java.util.Scanner;

public class AlphabetInRange {

    public static void main(String[] args) {

        /*
        printAlphabetInRange
        create a method that have 2 char as parameters: beginning, ending
        if beginning character is before ending character
            for example beginning A , ending D  -->> ABCD
        if beginning character is after ending character
            for example beginning D , ending A  -->> DCBA
         */

        printAlphabetInRange('A','D');
        printAlphabetInRange('K','B');
        printAlphabetInRange('B','B');
        printAlphabetInRange('a','d');
        printAlphabetInRange('A','z');
        printAlphabetInRange('Z','a');


    }

    public static void printAlphabetInRange(char beginning, char ending) {
//        char beginning='D';
//        char ending='A';

        if (beginning<ending) {
            for (char  i= beginning; i <=ending ; i++) {
                System.out.print(i);
            }
        } else if (beginning>ending) {
            for (char i = beginning; i >=ending ; i--) {
                System.out.print(i);
            }
        } else {
            System.out.print("They are same character!");
        }

        System.out.println();
    }
}
