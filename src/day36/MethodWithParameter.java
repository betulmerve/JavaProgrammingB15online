package day36;

public class MethodWithParameter {

    public static void main(String[] args) {

       // addOneHundred(25);

        int num=10;

        addOneHundred(num);

        System.out.println(num);

        num=addOneHundredAndReturn(num);
       System.out.println("num = " + num);
    }


    // this is what happen when we pass num to a method
//    public static void addOneHundred( ) {
//        x will copy whatever is inside num and assign it to num
//        int x = num ;
//        x = x + 100 ;  // if you change the value of x, does it change value of num
//        System.out.println( x );
//
//    }

    public static void addOneHundred(int x) {
        x=x+100;
        System.out.println(x);
    }

    public static int addOneHundredAndReturn(int x) {
        x=x+100;
        return x;
    }
}
