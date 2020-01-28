package day47;

//this is called concrete class
//concrete class must provide body for all inherited abstract methods
//or it will not even compile
public class GasCar extends Car {

    int gasLevel;

    public void start() {

        System.out.println("starting");
    }
    public void goForward() {

        System.out.println("going forward");
    }
    public void goBackward() {
        System.out.println("going backward");
    }
    public void turn(String direction) {
        System.out.println("turning "+direction);
    }

    //aslinda doCarThing diye de bir method var
    //ama abstract method olmadgi icin illa cagirmak zorunda degiliz
    //kullanmasak da oluyor
}
