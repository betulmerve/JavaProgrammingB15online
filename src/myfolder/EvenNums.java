package myfolder;

import java.util.Scanner;

public class EvenNums {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        for (int i = 0; i <=word.length()-1 ; i++) {

            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i'
            || word.charAt(i)=='u' || word.charAt(i)=='o') {
                System.out.print(word.charAt(i));
            } else {
                continue;
            }

        }




    }
}
