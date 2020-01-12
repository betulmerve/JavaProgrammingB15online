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

    //create a method to change the color

    public void changeColorTo(String newColor) {
        // Write bunch of code here to validate
        // user is actually passing correct color
        // for example  Red , Blue is valid color
        //              ABC,FGH is not valid color
        color=newColor;
    }





}
