package day39;

public class Car {

    int year;
    String model;
    String make;
    String color;


    // instance methods are tied to the object
    // it does not have have static keyword
    // we need an object when we call them

    public void goForward() {

        System.out.println(model+ " Going forward ");
    }

    // Create a method to print how old is this car

    public void printCarAge() {

        int currentYear=2020;
        System.out.println("Age of car is: "+ (currentYear-year) );
    }





}
