package myfolder;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_126 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        String[] arrayStr=str.split(", ");


        int countShortest=arrayStr[0].length();
        String shortest="";


        for (int x = 0; x < arrayStr.length; x++) {

            if (arrayStr[x].length()<countShortest) {
                countShortest=arrayStr[x].length();

            }

        }

        for (int x = 0; x < arrayStr.length; x++) {
            if (arrayStr[x].length()==countShortest) {
                shortest=shortest+(arrayStr[x]+",");
            }

        }

        String[] arrayNew=shortest.split(",");

        Arrays.sort(arrayNew);

        System.out.println(Arrays.toString(arrayNew));


    }
}
