package exercisesFromBook;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChp7 {

    public static void main(String[] args) {

//
//        /*
//        Write a complete Java program that reads 20 values of type double from the
//        keyboard into an array. Display the last (20th) number read. Then display
//        the numbers in the array and how much each number differs from the 20th
//        number read. For example, if the last value typed by the user is 5.0, the
//        difference between the array element 2.0 and 5.0 is −3.0. If an array element
//        is 7.0, the difference is 2.0. Assume that the user enters 20 numbers, one per
//        line, at the keyboard. You need not give elaborate instructions to the user.
//         */
//        Scanner scan=new Scanner(System.in);
//        double[] number=new double[20];
//
//        for (int i = 0; i < number.length; i++) {
//
//            number[i]=scan.nextDouble();
//
//        }
//
//        System.out.println("The last number is: "+number[number.length-1]);
//        System.out.println(Arrays.toString(number));
//
//        for (int x = 0; x < number.length; x++) {
//
//            System.out.println(number[x]+ " differs from the last number by:"+ (number[x]-number[number.length-1]) );
//
//        }


        /*
        Write some Java code that will declare an array named entry that has
        length 3, has SalesAssociate (Listing 7.3) as its base type, and is filled
        with three identical records. The records use the name "Jane Doe" and
        sales of $5000. Use a for loop.
         */

        String[] entry=new String[3];

        for (int i = 0; i < entry.length; i++) {

            entry[i]="Jane Doe";

        }

        System.out.println(Arrays.toString(entry));






    }
}
