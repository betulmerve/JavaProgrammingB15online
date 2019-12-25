package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {


        printArrayItems(new int[] {1,2,3,4,5});

        int[] scores={4,5,6,7,8};
        String[] name1={"Merve","Bilal", "Alperen"};
        String[] name2={"Merve", "Ali"};

        printArrayItems(scores);

        printMaxOfIntArray(scores);
        printMinOfIntArray(scores);
        printSumOfIntArray(scores);
        checkScoresAllMoreThan5(scores);
        compare2arraySize(name1,name2);

    }

    //printArrayItems
    //create a method it has 1 int array as a parameter
    //print each item in this format
    //array has items: ---> all the item here

    public static void printArrayItems(int[] nums) {

        System.out.println("Array has items: "+ Arrays.toString(nums));
    }

    // printMaxOfIntArray

    public static void printMaxOfIntArray(int[] number) {

        int max=number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i]>max) {
                max=number[i];
            }
        }
        System.out.println("The max number in this array is "+ max);

    }

    public static void printMinOfIntArray(int[] number) {
        int min=number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i]<min) {
                min=number[i];
            }

        }
        System.out.println("The min number in this array is "+min);
    }

    public static void printSumOfIntArray(int[] number) {

        int sum=0;
        for (int i = 0; i < number.length; i++) {

            sum=sum+number[i];

        }
        System.out.println("Sum of this array is "+sum);
    }

    public static void checkScoresAllMoreThan5 (int[] number) {

        int count=0;

        for (int i = 0; i < number.length; i++) {

            if (number[i]>5) {
                count++;
            }

        }
        if (count==number.length) {
            System.out.println("Everyone passed!");
        } else {
            System.out.println("Someone failed!");
        }

    }

    public static void compare2arraySize(String[] str1, String[] str2) {

        int sizeOfStr1=str1.length;
        int sizeOfStr2=str2.length;

        if (sizeOfStr1>sizeOfStr2) {
            System.out.println("Array 1 has more item");
        } else if (sizeOfStr2>sizeOfStr1) {
            System.out.println("Array 2 has more item");
        } else {
            System.out.println("Both are the same length!");
        }

    }

}
