package day57;

public class ExceptionExample {
    public static void main(String[] args) {

        System.out.println("Hello B15 Online Friends!");
        //int num=2.5; compiler error!!
        int[] nums=new int[3];
        nums[0]=55;
        nums[1]=56;
        nums[2]=57;
        //nums[3]=60; runtime error  ArrayIndexOutOfBoundsException is thrown here

        //System.out.println("Bye bye B15 Online friends");

        //int result=10/0;  run time error ArithmeticException: / by zero is thrown here
        //System.out.println("result is "+ result);

    }
}
