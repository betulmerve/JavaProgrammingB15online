package day54.interface_as_reference;

public class Utility {

    public static void main(String[] args) {

        Wearable w1=new Watch();
        Wearable w2=new Perfume();
        Wearable w3=new Clothes();
        Wearable w4=new Makeups();
        wearMyWearable(w1);
        wearMyWearable(w2);
        wearMyWearable(w3);
        wearMyWearable(w4);

        wearMyWearable(new Watch());

        Wearable result=getMyWearableObject();
        System.out.println("result.getClass().getSimpleName() = " + result.getClass().getSimpleName());

    }

    // create a static method called getMyWearableObject
    // it return a Wearable object (or anything IS-A Wearable)
    public static Wearable getMyWearableObject() {
//        return new Clothes();
//        return new Perfume();
        return new Watch();
    }

    //create a static void method
    //it has 1 parameter with type Wearable

    public static void wearMyWearable(Wearable any) {

        any.wear();
    }
}
