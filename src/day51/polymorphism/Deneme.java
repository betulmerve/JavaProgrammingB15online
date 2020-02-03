package day51.polymorphism;


import day49.Circle;
import day49.Shape;
import day49.Square;

import java.util.ArrayList;
import java.util.List;

public class Deneme {

    public static void main(String[] args) {

        List<Shape> lst=new ArrayList<>();

        Circle s1=new Circle("top",5);
        Square s2=new Square("kare",4);

        lst.add(s1);
        lst.add(s2);

        for (Shape each:lst) {
            each.calculateArea();
        }

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);





    }
}
