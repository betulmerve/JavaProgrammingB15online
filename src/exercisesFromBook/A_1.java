package exercisesFromBook;

public class A_1 {

    public A_1(){
        System.out.println("A class constructor.");
    }
}
class B extends A_1{
    public B(){
        System.out.println("B class constructor.");
    }
}
class Test extends B{

    public Test(){
        System.out.println("Test class constructor");
    }
}
class TestAll{
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1);
    }
}
