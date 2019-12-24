package day19;

public class SumOfAllNumbersWithinTheRange {

    public static void main(String[] args) {

        //one of the most famous interview questions!

        // get the sum of numbers from 1-10


        //sum= 0 because nothing has been added yet

//        sum=sum+1;   //1
//        sum=sum+2;   //3
//        sum=sum+3;   //6
//        sum=sum+4;   //10
//        sum=sum+5;   //15
//        sum=sum+6;   //21
//        sum=sum+7;   //28
//        sum=sum+8;   //36
//        sum=sum+9;   //45
//        sum=sum+10;   //55

        int sum=0;

        for (int i = 1; i <=10 ; i++) {
            //System.out.println(i);
            sum=sum+i;
            System.out.println(sum);
        }


    }
}
