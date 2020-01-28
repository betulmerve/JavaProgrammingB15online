package day47;

public class ShapeTest {

    public static void main(String[] args) {

        Rectangle r1=new Rectangle(10,5);
        System.out.println("before calculation r1 = " + r1);
        r1.calculateArea();
        System.out.println("after calculation r1 = " + r1);

        Triangle t1=new Triangle("Ucgen",10,5);
        t1.calculateArea();
        System.out.println(t1.area);





    }



}
