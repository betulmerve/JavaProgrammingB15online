package day47;

//can not extent final class
//public final class Sport {  diyemezsin!
public class Sport {

    //final method can not be overriden in subclass
    //it can be just used as is in sub class
    //just like family tradition
    //it just stay the same
    //we can just use it as is
    public final void doSomething() {
        System.out.println("doing regular sport");
    }

   public void doSomethingElse() {

       System.out.println("something else");
   }
}
