package day47;

public class ExtremeSport extends Sport{

//    @Override
//    public void doSomething() {
//        System.out.println("doing extreme sport");
//    }

    //you can not override
    //but you can do anything else
    //you can overload it
    public void doSomething(int x) {
        System.out.println("doing regular sport");
    }


    @Override
    //this final keyword is
    // blocking sub class of extreme sport
    //to override this method
    //public final void doSomethingElse() {
    public void doSomethingElse() {
        //super.doSomethingElse();
        System.out.println("doing something else in extreme sport");
    }


    //yani superclassta olan final method
    //buraya inherit oluyor sadece override edilmiyor
    //ayni sekilde kullanilabiliyor
    public static void main(String[] args) {
        ExtremeSport e1=new ExtremeSport();
        e1.doSomething();
    }


}
