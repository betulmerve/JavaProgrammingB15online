package day11;

public class PrimativeTypeEqualityCheck {
    public static void main(String[] args) {




        char c1='b';
        char c2='B';
        char c3='b';

        System.out.println(c1==c2);
        System.out.println(c3==c1);

        // all primitive type can be compared using == for their content equality
        // primative types are pure value

        int num1=10;
        int num2=10;
        System.out.println(num1==num2);
    }
}
