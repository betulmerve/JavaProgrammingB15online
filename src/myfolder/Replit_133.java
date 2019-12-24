package myfolder;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_133 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        binary[0]=decimal/128;
        binary[1]=(decimal%128)/64;
        binary[2]=(decimal%64)/32;
        binary[3]=(decimal%32)/16;
        binary[4]=(decimal%16)/8;
        binary[5]=(decimal%8)/4;
        binary[6]=(decimal%4)/2;
        binary[7]=(decimal%2)/1;

        System.out.println(Arrays.toString(binary));


    }
}
