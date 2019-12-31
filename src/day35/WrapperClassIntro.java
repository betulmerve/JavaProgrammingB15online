package day35;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int x=10;
        //primitives data types are pure value has no attribute or behaviour

        //each primitive type has wrapper class that turn it into object so we can treat it as a

        // this is the old not recommended way of create Integer Object
        //deprecated means it is old way, modasi gecmis
        Integer xObj1=new Integer(12);

        // valueOf method of Integer class
        // return a integer object by wrapping up the value you passed
        // it has 2 overloaded version one that accept int , another accept String
        Integer xObj2=Integer.valueOf(10);
        Integer xObj3=Integer.valueOf("10");

        byte bValue=xObj2.byteValue();
        System.out.println("byte Value = " + bValue);
        double dValue=xObj2.doubleValue();
        System.out.println("double Value = " + dValue);
    }
}
