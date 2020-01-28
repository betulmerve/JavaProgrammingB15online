package day47;

//i dont need to create a car object using this class
//i only one this class to be super class to provide
//reusable fields and methods for sub classes
//This class is design to be a super class

//abstract and final is OPPOSITE!!!
public abstract class Car {

    int year;
    String brand;


    //ONLY abstract class can have abstract method
    //it has abstract keyword
    //it does not have body, does not have {}
    //it ends with ;
    //IT IS MEANT TO BE OVERRIDDEN TO PROVIDE BODY
    //IN SUB CLASS
    public abstract void start();
    public abstract void goForward();
    public abstract void goBackward();
    public abstract void turn(String direction);
    public void doCarThing() {
        System.out.println("non abstract method can be in a abstract class");
    }
    public static void doStaticThing() {
        System.out.println("static method can be in a abstract class");
    }

}
