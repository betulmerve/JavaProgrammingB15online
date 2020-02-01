package day51;

public class Drone implements UprightFlyable {

    //  a class    implements  an  interface
//  an interface   extends  another  interface
//  a class    extends   class

    @Override
    public void flyUpright() {
        System.out.println("Flying upright ");
    }

    @Override
    public void fly() {
        System.out.println("Flying regulartly ");
    }
}
