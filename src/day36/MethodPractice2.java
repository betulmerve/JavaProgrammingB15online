package day36;

import java.util.Arrays;

public class MethodPractice2 {

    public static void main(String[] args) {

        /*
        write a static void method to accept a long array.
        It should swamp first value with last value of the array
         */
        long[] arr1={1L,2L,3L,4L,5L};
        System.out.println("before swap = " + Arrays.toString(arr1));
        swapFirstWithLastValue(arr1);
        System.out.println("after swap = " + Arrays.toString(arr1));


        long[] myNum1=new long[5];
        System.out.println("myNum1 = " + Arrays.toString(myNum1));
        String[] names=new String[5];
        System.out.println("names = " + Arrays.toString(names));

        Long[] myNum2=new Long[5];
        System.out.println("myNum2 = " + Arrays.toString(myNum2));


        int x=0;  //buna null assign edemiyoruz because it is primitive
        Integer x1=null; //ama buna edebiliyoruz because it is a reference type

        // ONE THING THAT PRIMITIVE VARIABLES CAN NOT DO IS :
        // WE CAN NOT ASSIGN IT TO NULL
        // ANY NON-PRIMITIVE VARIABLES (REFERENCE VARIABLES )
        // CAN ASSIGNED TO NULL VALUE
        // TO DEFINE , IT'S NOT POINTING TO ANY OBJECT YET



    }

    public static void swapFirstWithLastValue (long[] nums) {
        long temp;
        temp=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=temp;



    }
}
