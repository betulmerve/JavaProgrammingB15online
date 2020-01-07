package day37;

public class MethodOverloadingWithWrapper {

    public static void main(String[] args) {


        printNum(3);
        printNum(Integer.valueOf(100));
    }

    //it is always looking for exact match!
    //if it is found it is found
    //if it is not found it will try to look for something else


    public static void printNum(int x) {

        System.out.println("Printing primitive x= "+x);

    }

    public static void printNum(Integer x) {

        System.out.println("Printing Wrapper Object x= "+x);

    }
}
