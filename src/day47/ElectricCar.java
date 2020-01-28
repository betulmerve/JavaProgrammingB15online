package day47;

public class ElectricCar extends Car {

    int batteryLevel;

    @Override
    public void start() {

        System.out.println("this is how electric car starts");
    }

    @Override
    public void goForward() {
        System.out.println("it is going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("it is going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("turning to "+ direction);
    }



}
