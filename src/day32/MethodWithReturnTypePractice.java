package day32;

public class MethodWithReturnTypePractice {

    public static void main(String[] args) {

        System.out.println( divide(10,3));
        System.out.println(divide(10,0));

    }

    //create a method called divide
    //it has 2 double parameters and return the value of result as double
    //ama burda 0 a bolersek error olur bunu onlemek icin if statement yaziyoruz

    public static double divide(double num1,double num2) {

        if (num2==0) {
            return 0;
        } else {
            return num1/num2;
        }

    }
}
