package day31;

public class Calculator {

    public static void main(String[] args) {

        //create a static method that add
        //it accepts 2 numbers and print the result of addition
        add(6,23);
        add(1,5);
        add(3,56);
        addThreeNum(1,2,3);
    }

    //a static method that has 2 int parameter
    public static void add(int num1, int num2) {

        System.out.println("Additional result "+ (num1+num2));

    }

    //a static method that has 3 int parameter
    public static void addThreeNum(int num1,int num2,int num3) {

        System.out.println("Additional result is "+ (num1+num2+num3));

    }
}
