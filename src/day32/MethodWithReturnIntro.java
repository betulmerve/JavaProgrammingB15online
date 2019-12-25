package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {


        String myName=giveMeMyName();
        System.out.println("myName = " + myName);

        int myResult=doubleTheNumber(10);
        System.out.println("myResult = " + myResult);

        //we can also printout directly
        //bunu void methodla yapamazsin cunku bir value return etmiyor
        System.out.println("Result of doubling 100 is "+doubleTheNumber(100));

        System.out.println(add2Numbers(3,5));
        int add14to16Result=add2Numbers(14,16);
        System.out.println("add 14 to 16 result is " + add14to16Result);

        System.out.println(add2Numbers(3,5)+10);

    }

    //i want to create a method called giveMeMyName
    //it returns your name as a result

    public static String giveMeMyName() {

        return "Merve";

    }

    //create a static method that double the value of a number
    //it accept 1 int parameter and return doubled value of that number

    public static int doubleTheNumber(int num) {

        int result=num*2;
        return result;
    }

    //create a method called add accept 2 int parameter

    public static int add2Numbers (int num1,int num2) {
        int sum=num1+num2;
        return sum;

        //or you can say
        //return num1+num2;
    }
}
