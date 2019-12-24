package day32;

import javax.sound.midi.Soundbank;

public class StringActions {

    public static void main(String[] args) {

        /*
        reversePrintMyOwnName
        create a method that has no parameter
        and print your name in reversed order
         */

        reversePrintMyOwnName();
        printStringWithDashInBetween("Merve");
        printStringWithDashInBetween("Ali");

    }

    public static void reversePrintMyOwnName() {
        String myName="Merve";

        for (int x = myName.length()-1; x >= 0; x--) {

            System.out.print(myName.charAt(x));

        }
        System.out.println();

    }

    public static void printStringWithDashInBetween(String name) {
        //String myName="Merve";

        for (int x = 0; x < name.length(); x++) {

            if (x==name.length()-1) {
                System.out.println(name.charAt(x));
            } else {
                System.out.print(name.charAt(x)+ "-");
            }

        }



    }
}
