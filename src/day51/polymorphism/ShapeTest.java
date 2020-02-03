package day51.polymorphism;

import day09.CitizenTypeChecker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1=new Triangle();
        Shape s2=new Rectangle();
        Shape s3=new Circle();
        Shape s4=new Triangle();
        Shape s5=new Rectangle();

//        s1.draw();
//        s2.draw();
//        s3.draw();

        //create Array of Shape to store 5 concrete Shape Object
        //and call the draw method for each of them

        //Also try to create ArrayList of Shape
        //and call the draw method for each of them

        Shape[] shapes={s1,s2,s3,s4,s5};

        for (Shape each:shapes) {

            each.draw();

        }

        System.out.println("======================");

        //we can not add or remove item from this
        List<Shape> lst=Arrays.asList(s1,s2,s3,s4,s5);

        for (Shape each:lst) {

            each.draw();

        }



    }
}
