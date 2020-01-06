package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListUpdateValuePractice {

    public static void main(String[] args) {

        //ArrayList<String> teamMates = new ArrayList<>();
        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList = " + priceList);

        // change the third price to 10 $
        priceList.set(2,10d);
        System.out.println("third item new price = " + priceList.get(2));

        // Add 4 dollar to first price : your first price value should be original price + 4

        priceList.set(0,(priceList.get(0)+4));
        System.out.println("first item updated = " + priceList.get(0));

        // change last price to sum of first and second price
        priceList.set(priceList.size()-1, priceList.get(0)+priceList.get(1));
        System.out.println("last item updated =" + priceList.get(priceList.size()-1));

        // give 40% off to second price , so our new price should be 40% less than original price which is 60%

        priceList.set(1, priceList.get(1)*0.6);
        System.out.println("discounted second price = " + priceList.get(1));

        // DOUBLE THE VALUE OF EACH AND EVERY PRICE IN THE LIST :
        // THIS IS HOW WE DO IT FOR ONE , NOW WE DO IT FOR ALL OF THEM BY REPLACING THE INDEX WITH VARIABLE

        // in order to update an item we need an index and new value
        // in order to update the first value index will be 0
        // in order to double the price from the original , first we need to get the original value
        // then multiply by 2 and use that value for 2nd parameter of set method

//        ArrayList<Double> temp=new ArrayList<>();
//
//        for (int x = 0; x < priceList.size(); x++) {
//            temp.add(x,priceList.get(x));
//
//        }
//        System.out.println(temp);
//
//        for (int y = 0; y < priceList.size(); y++) {
//            priceList.set(y,temp.get(y)*2);
//
//        }
//        System.out.println("doubled pricelist ="+priceList);

        //ya da kisaca soyle

        for (int z = 0; z < priceList.size(); z++) {

            double newValue=priceList.get(z)*2;
            priceList.set(z,newValue);
        }
        System.out.println("doubled pricelist ="+priceList);

    }
}
