package myfolder;

import java.util.Scanner;

public class Replit_138 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] sentenceSplitted=sentence.split(" ");
        String reversed = "";

        for (int x = sentenceSplitted.length-1; x >=0 ; x--) {

            if (x==0) {
                reversed=reversed+sentenceSplitted[x];
            } else {
                reversed=reversed+sentenceSplitted[x]+" ";
            }

        }

        System.out.println(reversed);

    }
}
