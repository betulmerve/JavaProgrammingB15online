package day42;

public class Bike {

    int speed;
    int gear;

    // constructor is a block of code
    // that has same name as classname
    // and has no return type
    // if it does not meet above requirement
    // it will not be a constructor
    // the only time you can call this is :
    // when object is being created

    public Bike() {
        gear=1;
    }

    public Bike(int gear) {
        this.gear=gear;
    }

    public Bike(int gear, int speed) {
        this.gear=gear;
        this.speed=speed;
    }

}
