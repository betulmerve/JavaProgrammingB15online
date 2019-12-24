package day16;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class WakeUp1_Reverse {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please a 4 character word: ");
        String word1=scan.next();
        String word2="";

        word2=""+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        //word2=word2+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0); //alternatif
        //word2+=word1.charAt(3)+""+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);   //alternatif
        System.out.println(word2);





        String msg="Hello";
        // i want to add the world end of it
        //msg=msg+" World";
        msg+=" World";
        System.out.println("msg = " + msg);


    }
}
