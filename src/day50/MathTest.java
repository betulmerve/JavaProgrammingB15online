package day50;

public class MathTest {

    public static void main(String[] args) {

        Addition a1=new Addition(10,90);
        a1.calculate();
        System.out.println("a1 = " + a1);

        Addition a2=new Addition(3,5);
        System.out.println("a2 = " + a2);

        Subtraction s1=new Subtraction(10,5);
        s1.calculate();
        System.out.println("s1 = " + s1);
        Subtraction s2=new Subtraction(10,20);
        s2.calculate();
        System.out.println("s2 = " + s2);

    }
}
