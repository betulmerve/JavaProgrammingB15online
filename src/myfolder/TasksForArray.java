package myfolder;

import java.util.Arrays;

public class TasksForArray {

    public static void main(String[] args) {

//        /*
//        Create a String array of 6 items to store groceryItems
//        {"apple","banana","grape","strawberry","blueberry","kiwi"}
//        Create a float array of 6 float values to store prices
//        { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
//        assume that the order of grocery Items match the prices in same order.
//        Do below tasks :
//        • 1, loop through each grocery items and print them in one line
//          1.1 print each items at odd index
//          1.2 print all items in reverse order
//          1.3 find out the index location of strawberry
//          1.4 find out the count of groceries that contains berry in the name
//          1.5 print out all the character counts of the grocery items
//          1.6 print out only those items with even character count
//          1.7 print out only those items end with letter e
//          1.8 print out only last 3 characters of all the items
//          1.9 create String variable called allItems and store all the items inside array separated by comma.
//
//         */
//
        String[] groceryItems={"apple","banana","grape","strawberry","blueberry","kiwi"};

        for (int x = 0; x <= groceryItems.length-1; x++) {

            System.out.print(groceryItems[x]+" ");

        }

        System.out.println();

        for (int x = 0; x <= groceryItems.length-1 ; x++) {

            if(x%2==0) {
                continue;
            } else {
                System.out.print(groceryItems[x]+" ");
            }

        }

        System.out.println();

        for (int x = groceryItems.length-1; x >=0 ; x--) {
            System.out.print(groceryItems[x]+" ");

        }

        System.out.println();

        for (int x = 0; x <=groceryItems.length-1; x++) {

            if(groceryItems[x].equals("strawberry")) {
                System.out.println("Index number of strawberry is "+x);
            }

        }

        int berryCount=0;
        for (int x = 0; x <=groceryItems.length-1 ; x++) {

            if(groceryItems[x].contains("berry")) {
                berryCount++;
            }
        }
        System.out.println("Count of word contains berry is "+berryCount);

        for (int x = 0; x <=groceryItems.length-1 ; x++) {
            System.out.println("Char count of "+groceryItems[x]+" is "+ groceryItems[x].length());

        }

        for (int x = 0; x <=groceryItems.length-1 ; x++) {

            if (groceryItems[x].length()%2==1) {
                continue;
            } else {
                System.out.println(groceryItems[x]+" has even char count");
            }

        }


        for (int x = 0; x <= groceryItems.length-1; x++) {

            if (   !(groceryItems[x].endsWith("e"))  ) {
                continue;
            } else {
                System.out.println(groceryItems[x]);
            }
        }

        for (int x = 0; x <=groceryItems.length-1 ; x++) {

            System.out.println(groceryItems[x].substring(groceryItems[x].length()-3));

        }

        String allItems= Arrays.toString(groceryItems);
        System.out.println(allItems);


          /*
            • 2, loop through each prices  and print them in one line
            2.1 print each prices in even index
            2.2 print only prices less that 3 dollars
            2.3 print the sum of all the prices and get average
            2.4 print only the second half of prices (last 3)
            2.5 print the sum of the middle two prices
            2.6 print only prices more than average price
            2.7 find out max price and print out max price and  index of max price
            2.8 find out the minimum price and index of minimum price
            2.9 find out second max price and index(challenging)
         */

        float[] prices={1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f};

        for (int x = 0; x <= prices.length-1; x++) {

            if (x%2==1) {
                continue;
            } else {
                System.out.print(prices[x]+" ");
            }
        }

        System.out.println();

        for (int x = 0; x <= prices.length-1; x++) {

            if (prices[x]>=3) {
                continue;
            } else {
                System.out.print(prices[x]+" ");
            }
        }

        System.out.println();

        float sum=0;

        for (int x = 0; x <=prices.length-1 ; x++) {

            sum=sum+prices[x];

        }

        System.out.println("sum = " + sum);
        System.out.println("average="+ (sum/prices.length) );
        float averagePrice=(sum/prices.length);

        for (int x = 0; x < prices.length; x++) {

            if (x< (prices.length/2) ) {
                continue;
            } else {
                System.out.println(prices[x]);
            }

        }
        System.out.print("Sum of the middle two prices is ");
        System.out.println( prices[(prices.length/2) ]+prices[(prices.length/2)-1 ]);

        System.out.print("More than avg prices are :");
        for (int x = 0; x <=prices.length-1 ; x++) {
            if(prices[x]<=averagePrice) {
                continue;
            } else {
                System.out.print( prices[x]+" ");
            }

        }

        System.out.println();

        float maxPrice=prices[0];
        int indexOfMaxPrice=0;

        for (int x = 0; x <=prices.length-1 ; x++) {

            if(prices[x]>maxPrice) {
                maxPrice=prices[x];
                indexOfMaxPrice=x;
            }
        }
        System.out.println("Max price is "+ maxPrice);
        System.out.println("Index of max price is "+indexOfMaxPrice);


        float minPrice=prices[0];
        int indexOfMinPrice=0;

        for (int x = 0; x <=prices.length-1 ; x++) {

            if (prices[x]<minPrice) {
                minPrice=prices[x];
                indexOfMinPrice=x;
            }
        }
        System.out.println("Min price is "+ minPrice);
        System.out.println("Index of min price is "+indexOfMinPrice);


        float secondMaxPrice=prices[0];
        int indexOfSecondMax=0;

        for (int x = 0; x <=prices.length-1 ; x++) {

            if(prices[x]==maxPrice) {
                continue;
            }

            if(prices[x]>secondMaxPrice) {
                secondMaxPrice=prices[x];
                indexOfSecondMax=x;

            }

        }

        System.out.println("Second max price is "+ secondMaxPrice+" and the index is "+indexOfSecondMax);





    }
}
