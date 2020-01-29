package day48;

public interface Bouncible {

    //THIS IS EXCLUSIVE TO INTERFACE TYPE
    //NOWHERE ELSE YOU GET THIS AT ALL!!!

    //if you dont add any part of public static final for the field
    //all interface fields are automatically public static final
    double GRAVITY=9.81;
    //public static final double GRAVITY=9.81;

    //public abstract void bounce();
    //every member of interface automatically public
    //if no access modifier is given
    //all the method with no body automatically public abstract
    void bounce();

}
