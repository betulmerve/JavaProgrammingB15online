package day29;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class FillingUpArrayValue {

    public static void main(String[] args) {


        //create an int array with size 100 and fill it up as below
        //fill up from 1 to 100

        int[] numbers=new int[100];

        for (int x = 0; x < numbers.length; x++) {

            numbers[x]=x+1;

        }
        System.out.println(Arrays.toString(numbers));











    }
}
