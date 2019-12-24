package day31;

public class MethodPractice {

    public static void sayHelloWordSevenTimes() {

        System.out.println("Hello world line 1");
        System.out.println("Hello world line 2");
        System.out.println("Hello world line 3");
        System.out.print("Hello world line 4");
        System.out.print("Hello world line 5 ");
        System.out.println("Hello world line 6");
        System.out.println("Hello world line 7");

    }

    public static void calculateMathProblem() {
        int num1=5;
        double num2=3.0d;
        float num3=3.0f;
        double result1=num1+num2;
        double result2=num1-num2;
        double result3=num1*num2;
        double result4=num1/num2;
        float result5=num1/num3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }



    public static void main(String[] args) {
        //you can call directly since we are in the same class
        sayHelloWordSevenTimes();
        calculateMathProblem();
        //you can call static method of other class
        // using className.methodName()
        MethodIntro.sayHello();

    }
}
