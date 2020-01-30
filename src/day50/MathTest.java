package day50;

import java.util.Arrays;
import java.util.List;

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

        Multiplication m1=new Multiplication(10,5);
        System.out.println("m1 = " + m1);
        m1.calculate();
        System.out.println("m1 = " + m1);

        Division d1=new Division(10,5);
        d1.calculate();
        System.out.println("d1 = " + d1);

        Division d2=new Division(10,0);
        d2.calculate();
        System.out.println("d2 = " + d2);

        Division d3=new Division(10,50);
        d3.calculate();
        System.out.println("d3 = " + d3);

        System.out.println("================");

        List<Question> allTestQuestions= Arrays.asList(a1,a2,s1,s2,m1,d1,d2,d3);
        for (Question each:allTestQuestions) {

            System.out.println("each = " + each);

        }


    }
}
