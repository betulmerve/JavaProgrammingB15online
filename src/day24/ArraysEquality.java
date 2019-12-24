package day24;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {

        int[] scores1={2,3,4,7,8,6,4};
        int[] scores2={55,44,6,7,8,99,1};
        int[] scores3={2,3,4,7,8,6,4};
        int[] scores4={3,4,7,8,6,4,2};


        //bu sekilde olmuyor ayni String gibi
//        System.out.println(scores1==scores2);  //false
//        System.out.println(scores1==scores3);  //false

        //for checking equality of 2 array object content
        //equals  ----> Arrays.equals(firstArray,secondArray)

        boolean isS1S2Equal=Arrays.equals(scores1,scores2);
        System.out.println(isS1S2Equal);
        boolean isS1S3Equal=Arrays.equals(scores1,scores3);
        System.out.println(isS1S3Equal);
        System.out.println(Arrays.equals(scores2,scores3));
        //score3 and score4 have same numbers but different order
        //they are not equal!
        System.out.println(Arrays.equals(scores3,scores4));

        //try first sort them than compare equality
        //simdi equal oldular

        Arrays.sort(scores3);
        Arrays.sort(scores4);
        System.out.println(Arrays.equals(scores3,scores4));


        //additional task
        //int[] scores1={2,3,4,7,8,6,4};
        for (int x = 0; x <=scores1.length-1 ; x++) {

            if(scores1[x]==4) {
                System.out.println("Index is "+x);
                break;
            }

        }



    }
}
