package day22;

import java.util.Enumeration;

public class CanvasDayModuleLinkGenerator {

    public static void main(String[] args) {

        /*
        Here is the direct links to lead you to correct days
https://learn.cybertekschool.com/courses/278/modules#3317
this will lead you to day 21
https://learn.cybertekschool.com/courses/278/modules#3318
this will lead you to day 22
https://learn.cybertekschool.com/courses/278/modules#3319
this will lead you to day 23
https://learn.cybertekschool.com/courses/278/modules#3320
this will lead you to day 24
and so on
So write a program to generate the links to
lead you to the right module of the day from day 21 all the way till day 56

         */
        int num=3296;

        for (int i = 21; i <=56 ; i++) {

            System.out.println("https://learn.cybertekschool.com/courses/278/modules#"+(num+i) );
            System.out.println("this will lead you to day "+i);

        }
    }
}
