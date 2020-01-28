package day48;

// this is how we create an interface
// interface is abstract type just like abstract class
// no object can be created from it
// it provide guideline for implementing classes
// it's like signing a contract
public interface Flyable {

    //an interface public static final field
    public static final boolean HAVE_WING=true;

    public abstract void fly();

    // can we have constructor ? : ABSOLUTELY NO !!!!!!!!!!!




    //abstract class olusturdugumuzda sub classlarin ortak bir cok ozellikleri oluyor
    //instance field olusturarak bunlari destekliyoruz
    //fakat interface sub classlarinin tek bir ortak ozelligi var genelde
    // ornegin flyable interface altinda kite, superman, plane :tek ozellik ucabilmeleri
    //
}
