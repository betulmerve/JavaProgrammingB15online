package day27;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {

    public static void main(String[] args) {

//        int[] numbers=new int[5];
//        Scanner scan=new Scanner(System.in);
//
//        for (int x = 0; x < 5; x++) {
//
//            System.out.println("Please enter a number");
//            numbers[x]=scan.nextInt();
//
//        }
//
//        System.out.println(Arrays.toString(numbers));
//
//        //find the max in array
//
//        Arrays.sort(numbers);  //ascending order
//
//        System.out.println("Max num in this array is "+numbers[numbers.length-1]);
//
//        System.out.println("Min num in this array is "+numbers[0]);

        //find the max without sort

        int[] scores={100,50,60,80,40};

        int minNumber=scores[0];

        for (int x = 0; x <=scores.length-1 ; x++) {

            if (scores[x]<minNumber) {
                minNumber=scores[x];
            }

        }

        System.out.println("Min num is "+minNumber);


        //find the second min

        int secondMinNumber=scores[0];

        for (int x = 0; x < scores.length; x++) {

            if (scores[x]==minNumber) {
                continue;
            } else if (scores[x]<secondMinNumber){

                secondMinNumber=scores[x];

            }

        }

        System.out.println("The second min number is "+secondMinNumber);

        //find the third num num

        int thirdMinNumber=scores[0];

        for (int x = 0; x < scores.length; x++) {

            if (scores[x]==minNumber || scores[x]==secondMinNumber) {
                continue;
            } else if (scores[x]<thirdMinNumber){

                thirdMinNumber=scores[x];

            }

        }

        System.out.println("The third min number is "+thirdMinNumber);

        //max num

        int [] nums={50,40,60,70,80,90};

        int largestNum=nums[0];

        for (int x = 0; x < nums.length; x++) {

            if (nums[x]>largestNum) {
                largestNum=nums[x];
            }

        }

        System.out.println("The largest number is "+largestNum);

        //second largest num

        int secondLargestNum=nums[0];

        for (int x = 0; x < nums.length; x++) {

            if (nums[x]==largestNum) {
                continue;
            } else if(nums[x]>secondLargestNum) {
                secondLargestNum=nums[x];
            }

        }
        System.out.println("The second largest num is "+secondLargestNum);


        //third largest num

        int thirdLargestNum=nums[0];

        for (int x = 0; x < nums.length; x++) {

            if (nums[x]==largestNum || nums[x]==secondLargestNum) {
                continue;
            } else if(nums[x]>thirdLargestNum) {
                thirdLargestNum=nums[x];
            }

        }
        System.out.println("The third largest num is "+thirdLargestNum);


    }
}
