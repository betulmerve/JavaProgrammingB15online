package day36;

public class WrapperReview {

    public static void main(String[] args) {

        Integer i1=new Integer(10000000);
        Integer i2=Integer.valueOf(123);

        //primitive stay in stack
        //every object stay in heap

        //auto boxing: primitive to wrapper type conversion


        Integer i3=45;  //---->> 45 --->> new Integer(45);  so it is stay in heap

        int i4=54;  // so it is stay in stack

        //auto unboxing: wrapper type to primitive type conversion
        int i5=new Integer(100);

        //AUTO BOXING AND UNBOXING IS UNIQUE FEATURE OF
        //CONVERSION BETWEEN PRIMITIVE VALUE WRAPPER CLASSES OBJECT



    }
}
