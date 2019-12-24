package myfolder;

import java.util.Arrays;

public class TasksForArray_2 {

    public static void main(String[] args) {


        /*
        • 3, assume that the order of grocery Items match the prices in same order do below:
            3.1 print first item and first price in one print statement -->>  apple price is 1.99
            3.2 print last item and last price in one print statement-->>  kiwi price is 2.88
            3.2 print all items and prices in one for loop together
            3.3 print only those items with price more than 3.11
            3.4 print only those items with price more than average
            3.5 print only those prices of grocery items that contains letter b
            3.6 print the item name with max price
            3.7 print the item name with min price

         */

        String[] groceryItems={"apple","banana","grape","strawberry","blueberry","kiwi"};
        float[] prices={1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f};

        System.out.println(groceryItems[0]+" price is "+ prices[0]);
        System.out.println(groceryItems[groceryItems.length-1]+" price is "+prices[prices.length-1]);

        for (int x = 0; x <=groceryItems.length-1 ; x++) {
            System.out.println(groceryItems[x]+" price is "+ prices[x]);
        }

        for (int x = 0; x <=groceryItems.length-1 ; x++) {

            if (prices[x]>3.11) {
                System.out.println(groceryItems[x]+" price is "+ prices[x]);
            }
        }

        float sum=0;

        for (int x = 0; x <=prices.length-1 ; x++) {

            sum=sum+prices[x];

        }

//        System.out.println("sum = " + sum);
        System.out.println("average="+ (sum/prices.length) );
        float averagePrice=(sum/prices.length);

        for (int x = 0; x <=groceryItems.length-1 ; x++) {

            if (prices[x]>averagePrice) {
                System.out.println(groceryItems[x]+" price is "+ prices[x]);
            }
        }



        for (int x = 0; x <=groceryItems.length-1 ; x++) {

            if (groceryItems[x].contains("b")) {
                System.out.println(groceryItems[x]+" price is "+ prices[x]);
            }
        }

        float maxPrice=prices[0];
        int indexOfMaxPrice=0;

        for (int x = 0; x <=prices.length-1 ; x++) {

            if(prices[x]>maxPrice) {
                maxPrice=prices[x];
                indexOfMaxPrice=x;
            }
        }
//        System.out.println("Max price is "+ maxPrice);
//        System.out.println("Index of max price is "+indexOfMaxPrice);


        float minPrice=prices[0];
        int indexOfMinPrice=0;

        for (int x = 0; x <=prices.length-1 ; x++) {

            if (prices[x]<minPrice) {
                minPrice=prices[x];
                indexOfMinPrice=x;
            }
        }
//        System.out.println("Min price is "+ minPrice);
//        System.out.println("Index of min price is "+indexOfMinPrice);


        for (int x = 0; x <=groceryItems.length-1 ; x++) {

            if (prices[x]==maxPrice) {
                System.out.println(groceryItems[x]+" price is "+ prices[x]);
            }
        }

        for (int x = 0; x <=groceryItems.length-1 ; x++) {

            if (prices[x]==minPrice) {
                System.out.println(groceryItems[x]+" price is "+ prices[x]);
            }
        }

        /*
        • 4 , Below tasks will modify array :  (for each loop should not be used, try and see why)
           4.1 swap the value of first item in array with last item of array , swap apple with kiwi
           4.2 use for loop to loop through your groceryItems array and modify your items like this :
                    itemValue+itemCharacterCount
                    For example : {"apple5","banana6","grape5","strawberry10","blueberry9","kiwi4"}
           4.3 increase the value of each prices by one  in prices array
           4.4 double the value of each prices in your array 1.99-->> 1.99*2
           4.5 triple the value of each prices if it is less than 2 1.99 -->> 1.99*3
           4.6 now find out highest price after the modification
           4.7 find out the most expensive item name. (edited)
         */

        for (int x = 0; x <=groceryItems.length-1 ; x++) {

            groceryItems[x]=groceryItems[x]+groceryItems[x].length();

        }
        System.out.println(Arrays.toString(groceryItems));


        for (int x = 0; x <=prices.length-1 ; x++) {

            prices[x]=prices[x]+1;

        }

        System.out.println(Arrays.toString(prices));

        for (int x = 0; x <=prices.length-1 ; x++) {

            prices[x]=prices[x]*2;

        }

        System.out.println(Arrays.toString(prices));


        for (int x = 0; x <=prices.length-1 ; x++) {

            if (prices[x]<2) {
                prices[x]=prices[x]*3;
            }
        }

        System.out.println(Arrays.toString(prices));


        maxPrice=0;
        indexOfMaxPrice=0;

        for (int x = 0; x <=prices.length-1 ; x++) {

            if (prices[x]>maxPrice) {
                maxPrice=prices[x];
                indexOfMaxPrice=x;
            }
        }
        System.out.println("Max price is "+ maxPrice);
        System.out.println("The most expensive item is "+groceryItems[indexOfMaxPrice]);































    }
}
