package day43;

public class StarbucksUtil {

    public static void main(String[] args) {

        printInfo(new Coffee("decaf",3,4.99));

//         we would need an object of current class if we wanted call
//         instance method of current class
//         if it is non static it is instance
//        StarbucksUtil util = new StarbucksUtil();
//        util.printStringInfo(myString);

    }

    /**
     * a static method to accept a coffee object and print it's information
     * like this : This coffee is : name , price is <price> , caffine level is <level>
     *
     * @param co the coffee object caller pass
     */

    public static void printInfo(Coffee co) {
        System.out.println("This coffee is "+co.getType()+" price is "
                +co.getPrice()+" caffeine level is "+co.getCaffeineLevel());
    }

    /**
     * a static method to print out first and last character of a String
     *
     * @param str
     */

    public static void printFirstAndLastChar(String str) {
        System.out.println("the first char of string is "+str.charAt(0));
        System.out.println("the last char of string is "+str.charAt(str.length()-1));
    }


}
