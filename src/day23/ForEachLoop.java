package day23;

public class ForEachLoop {

    public static void main(String[] args) {

        double[] prices={99.23,11.99,100.23,99.99,56,34};

        //eger sadece Array ciktisi almak istiyorsan index ihtiyacin yoksa
        //for each loop en kolayi ve kisasi


        //for each loop syntax
        //for (dataTypeOfYourArray   variableNameForEachItem : yourArrayVariable) {
        //
        // do something with your Array item
        // }

        for (int x = 0; x <=prices.length-1 ; x++) {
            double eachPrice=prices[x];
            System.out.println(eachPrice);
        }

        //easier way! make your life easy
        //only disadvantage is there is no index!

        for (double eachPrice : prices) {
            System.out.println("eachPrice = " + eachPrice);
        }
    }
}
