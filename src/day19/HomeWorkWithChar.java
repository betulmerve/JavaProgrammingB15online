package day19;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class HomeWorkWithChar {
    public static void main(String[] args) {

        //ask user starting char and ending char
        //then print everything between
        //it could be starting char after ending char
        //user can enter Z A or A K
        //how do you ask user a char?
        //ask user for string and pick first char


        Scanner scan=new Scanner(System.in);
        System.out.println("What is your starting character?");
        String startingPoint=scan.next();
        char startingChar=startingPoint.charAt(0);
        System.out.println("What is your ending character?");
        String endingPoint=scan.next();
        char endingChar=endingPoint.charAt(0);

        if(startingChar<endingChar) {
            System.out.println("Increase!");
            for (int i=startingChar ; startingChar <=endingChar ; startingChar++) {
                System.out.print(startingChar+" ");
            }
        } else if(startingChar>endingChar) {
            System.out.println("Decrease!");
            for (int i = startingChar; startingChar >=endingChar ; startingChar--) {
                System.out.print(startingChar+" ");

            }
        } else {
            System.out.println("do not need to print, same point!");
        }



    }

}
