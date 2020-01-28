package day47;

public class Garage {

    public static void main(String[] args) {

        // Abstract class can not be instantiated
        // It means we can not create object out of it
        //Car c1=new Car();

        ElectricCar c1=new ElectricCar();
        c1.goBackward();
        c1.goForward();
        c1.start();
        c1.turn("left");

        GasCar g1=new GasCar();
        g1.goBackward();
        g1.goForward();
        g1.start();
        c1.turn("right");
    }
}
