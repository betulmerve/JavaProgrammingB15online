package day32;

public class NumberAction {

    public static void main(String[] args) {

        /*
        numberComparision
        this method has 2 parameter num1 num2
        if num1>num2   print num1 is more than num2
        if num2>num1   print num2 is more than num1
        if num1==num2  print num1 and num2 is equal


        stringRepeater
        this method has 2 parameters called
        String strToRepeat and int count
        repeat printing the String as many time as count number define


         * skipCountBy3From0to50
         *
         * * create a method that has no parameter
         * and skip count by 3 from 0 to 50
         *
         * countDownByEvenNumberFrom50to0
         * * create a method that has no parameter
         * and count Down By Even Number From 50 to 0
         * for example 50 , 48 , 46 .....0
         *
         * print1toX
         * * create a method that has 1 int parameter called x
         * print from 1 to that number in one line
         * print an empty line after the print.

         countDownEvenNumberFromXToY

         */
        numberComparision(5,10);
        numberComparision(15,9);
        numberComparision(3,3);
        repeatString("Merve",3);
        repeatString("Ali",5);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(10);
        print1toX(25);
        countDownEvenNumberFromXToY(10,5);
        countDownEvenNumberFromXToY(20,2);

    }

    public static void numberComparision(int num1, int num2) {
        if (num1>num2) {
            System.out.println(num1+" is more than "+num2);
        } else if(num2>num1) {
            System.out.println(num2+ " is more than "+ num1);
        } else if(num1==num2) {
            System.out.println(num1 + " and "+ num2+ " are equal");
        }
    }

    public static void repeatString (String strToRepeat, int count) {
        for (int x = 1; x <=count ; x++) {

            System.out.println(strToRepeat);

        }
    }

    public static void skipCountBy3From0to50() {
        for (int x = 0; x <=50 ; x=x+3) {

            System.out.print(x+ " ");

        }
        System.out.println();
    }

    public static void countDownByEvenNumberFrom50to0() {
        for (int i = 50; i >=0 ; i--) {

            if (i%2==0) {
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

    public static void print1toX(int x) {

        for (int i = 1; i <=x ; i++) {

            System.out.print(i+ " ");

        }
        System.out.println();

    }

    public static void countDownEvenNumberFromXToY(int num1, int num2) {

        if (num1>num2) {
            for (int i = num1; i >=num2 ; i--) {
                if (i%2==0) {
                    System.out.print(i+" ");
                }

            }
            System.out.println();
        } else if(num2>num1) {
            for (int i = num2; i >=num1 ; i--) {
                if (i%2==0) {
                    System.out.print(i+ " ");
                }

            }
            System.out.println();
        } else {
            System.out.println("Two numbers are the same!");
        }
    }


}
