package day34;

import java.util.Arrays;
import day31.Calculator_v2;


public class MathAction {

    //calling the static method of other class

    public static void main(String[] args) {

        //call your build3digitnumber here
        //Classname.methodNAme()

        int result1=PracticeMethodWithNumbers.build3DigitNumber(3,2,1);
        System.out.println("result1 = " + result1);

        //in order to use Arrays class that coming from java.util package
        //first we need to import java.util.Arrays;
        //in order to call static method of Array class, we need to use ClassName.MethodName(..);

        int[] nums={2,5,87};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        //how can i called static method called calculate in Calculator_V2 under day31 package
        //it is not under current package we need to import the class
        //import day31.Calculator_V2;
        //Calculator_v2.calculate('+',1,2);

        Calculator_v2.calculate('+',1,2);
        Calculator_v2.calculate('*',2,2);

    }
}
