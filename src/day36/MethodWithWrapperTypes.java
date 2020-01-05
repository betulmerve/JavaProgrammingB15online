package day36;

public class MethodWithWrapperTypes {

    public static void main(String[] args) {

        //i1 is a variable with data type Integer
        //and it can store integer Object
        //what's deal here with 12?? --> autoboxing
        Integer i1=12;
        Integer i2=20;
        sumAndPrint(i1,i2);

        sumAndPrint(23,10);
        sumAndPrint(new Integer(23),new Integer(10));
        sumAndPrint(Integer.valueOf(23),Integer.valueOf(10));

        printTheDoubledValue(10);
        // Why we can pass Integer Object to a method that accept int
        // It will turn it into int by the power of auto-unboxing
        printTheDoubledValue(new Integer(10));
    }


    public static void sumAndPrint(Integer num1, Integer num2) {
        // We can not add two object
        // what is happening here is
        // the moment the + operator appeared ,
        // compiler will turn num1 and num2 into int so it can add them numerically
        // Integer to int conversion -->> auto-unboxing
        System.out.println(num1+num2);
    }

    public static void printTheDoubledValue(int x) {
        System.out.println("after doubling x= " + (x*2) );

    }
}
