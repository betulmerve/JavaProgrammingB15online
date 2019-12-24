package day29;

import java.util.Arrays;

public class FillingUpArrayWithEvenNumber {

    public static void main(String[] args) {


        //fill up with even numbers from 1 to 100

        /*
        num0=0
        num1=2
        num2=4
        num3=4

         */

        int[] numbers=new int[100];

        for (int x = 0; x < numbers.length; x++) {

            numbers[x]=x*2;

        }

        System.out.println(Arrays.toString(numbers));



        int count=0;
        for (int i = 0; i < numbers.length*2; i++) {

            if (i%2==0) {
                numbers[count]=i;
                count++;
            }

        }

        System.out.println(Arrays.toString(numbers));



        String[] love=new String[300];

        for (int x = 0; x < love.length; x++) {
            love[x]="I Love Java";
        }

        System.out.println(Arrays.toString(love));
    }
}
