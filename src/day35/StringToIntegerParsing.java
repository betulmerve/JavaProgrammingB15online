package day35;

public class StringToIntegerParsing {

    public static void main(String[] args) {

        //I have a employee ID: "FB-457"
        //give me the employee number and store it into a number

        String strNum="100";
        int num=Integer.parseInt(strNum);
        System.out.println(num);

        String empID="FB-457";

        /*
         * Integer class is class coming from java.lang package
         * It's primarily used for wrapping up primitive value and treat it as an object
         * what we will focus here is though
         *  many useful static methods it provide already
         *  parseInt is a static method of Integer class
         *  It will turn a String that has only numbers and return int result
         *  if we have any non-numerical character -->> It will throw NumberFormatException
         * */

        int id=Integer.parseInt(empID.split("-")[1]);
        System.out.println(id);


    }
}
