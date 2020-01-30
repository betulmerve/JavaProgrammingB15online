package day49;

//you are building super-sub relationship, IS-A relationship
// a class can only extends one other class
// a class can implements multiple interfaces
public class Burger implements Edible, Juicy{


//    public static final boolean IS_HUMAN_FOOD=true;
//
//    public Burger() {
//        super();
//    }

    @Override
    public void eat() {
        System.out.println("Eating burger with a big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger and drink soda");
    }

    @Override
    public void melt() {
        System.out.println("Juicy burger is melting");
    }
}
