package day31;

//WHY DO WE NEED TO HAVE A METHOD?
//REUSABLE CODE!! AVOID CODE DUPLICATE

public class MethodIntro {

    //DO NOT CREATE A METHOD INSIDE MAIN METHOD!!!!
    //IT CAN BE ANYWHERE INSIDE THE CLASS OUTSIDE THE MAIN METHOD
    public static void sayHello() {

        System.out.println("Hello World");
        System.out.println("My name is Merve");
        System.out.println("I love Java");

    }

    //EXECUTION FLOW ALWAYS STARTS WITH MAIN METHOD!

    public static void main(String[] args) {

        //two ways to call static methods
        //ClassName.methodName(external data if needed)
        //if you are in the same class you can directly called them
        //methodName.(external data if needed)
//        MethodIntro.sayHello();  //optional if you are in the same class
        System.out.println("Begin");
        sayHello();
        System.out.println("------------");
        sayHello();
        System.out.println("The end!");

    } //MAIN METHOD ENDS HERE!





}
