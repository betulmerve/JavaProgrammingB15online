package day49;

// CAN A CLASS BOTH EXTEND ANOTHER CLASS AND IMPLEMENT AN INTERFACE?
public class IceCream extends Object implements Edible{

    @Override
    public void eat() {
        System.out.println("Eating icecrean with joy");
    }

    @Override
    public void drink() {
        System.out.println("Eat icecream and drink coke");
    }

    @Override
    public void digest() {
        System.out.println("Digest icecream by soda");
    }


    public static void main(String[] args) {
        IceCream i1=new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());
        i1.digest();


        // since Object class exists , we can create object out of it
        //Object o1 = new Object();
    }
}
