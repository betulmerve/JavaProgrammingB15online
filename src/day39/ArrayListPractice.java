package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

         /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18")
        );
        System.out.println("productLst = " + productLst);

//         * Task 1 : print only items name
        System.out.println("task1");

//        for (int x = 0; x < productLst.size(); x++) {
//
//            System.out.println("item name is: "+productLst.get(x).split(",")[0]);
//            System.out.println("item price is: "+productLst.get(x).split(",")[1]);
//            System.out.println("item monthly is: "+productLst.get(x).split(",")[2]);
//
//        }

        for (String eachProduct:productLst) {
            System.out.println("item name is: "+eachProduct.split(",")[0]);
        }

//         * Task 2 : print all the prices more than 500

        System.out.println("task2");

        for (int x = 0; x < productLst.size(); x++) {

            if (Double.parseDouble(productLst.get(x).split(",")[1])>500) {
                System.out.println("more than 500 is: "+productLst.get(x).split(",")[1]);
            }
        }

//         * Task 3 : print average price

        System.out.println("task3");
        double sum=0;
        double avg=0;

        for (int x = 0; x < productLst.size(); x++) {

            sum=sum+Double.parseDouble(productLst.get(x).split(",")[1]);

        }
        avg=sum/productLst.size();

        System.out.println("average price is: "+avg);

//         * Task 4 : print all the items name that has less than 20$ monthly payment.

        System.out.println("task4");
        for (int x = 0; x < productLst.size(); x++) {
            if (Double.parseDouble(productLst.get(x).split(",")[2])<20) {
                System.out.println("item name is: "+productLst.get(x).split(",")[0]);
            }

        }

//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.

        System.out.println("task5");
        for (int x = 0; x < productLst.size(); x++) {
            if (productLst.get(x).split(",")[0].contains("iPhone")) {
                System.out.println(productLst.get(x).split(",")[0]+ " monthly payment is: "+productLst.get(x).split(",")[2]);
            }

        }

//         * Task 6 : Print all information about most expensive items.
        System.out.println("task6");

        double max=Double.parseDouble(productLst.get(0).split(",")[1]);
        int indexOfMax=0;
        for (int x = 0; x < productLst.size(); x++) {
            if (Double.parseDouble(productLst.get(x).split(",")[1])>max) {
                max=Double.parseDouble(productLst.get(x).split(",")[1]);
                indexOfMax=x;
            }

        }
        System.out.println(productLst.get(indexOfMax));



//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)

        System.out.println("task7");

        int indexOfDyson=0;
        for (int x = 0; x < productLst.size(); x++) {
            if (productLst.get(x).contains("Dyson")) {
                indexOfDyson=x;
            }

        }
        System.out.println(indexOfDyson);

        String dysonDetail=productLst.get(indexOfDyson);
        String name=productLst.get(indexOfDyson).split(",")[0];
        double priceOfDyson=Double.parseDouble(dysonDetail.split(",")[1]);
        double monthly=Double.parseDouble(dysonDetail.split(",")[2]);

        dysonDetail=name+","+priceOfDyson*0.2+","+monthly*0.2;

        System.out.println("dysonDetail = " + dysonDetail);




//         * Task 8 : Count the items prices more than average price.

        System.out.println("task8");

        int count=0;

        for (int x = 0; x < productLst.size(); x++) {

            if (Double.parseDouble(productLst.get(x).split(",")[1])>avg) {
                count++;
            }

        }
        System.out.println(count);

//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.

        System.out.println("task9");
        ArrayList<String> newArr=new ArrayList<>();
        for (int x = 0; x < productLst.size(); x++) {

            if (Double.parseDouble(productLst.get(x).split(",")[1])>avg) {
                newArr.add(productLst.get(x));
            }

        }
        System.out.println(newArr);

        productLst.removeAll(newArr);
        System.out.println(productLst);


//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :

        System.out.println("additional tas");

        ArrayList<String> itemNames=new ArrayList<>();
        ArrayList<Double> prices=new ArrayList<>();
        ArrayList<Double> monthlyPayments=new ArrayList<>();

        for (int x = 0; x < productLst.size(); x++) {

            String items=productLst.get(x).split(",")[0];
            itemNames.add(items);

        }
        System.out.println(itemNames);


        for (int x = 0; x < productLst.size(); x++) {

            double price=Double.parseDouble(productLst.get(x).split(",")[1]);
            prices.add(price);

        }
        System.out.println(prices);

        for (int x = 0; x < productLst.size(); x++) {

            double month=Double.parseDouble(productLst.get(x).split(",")[2]);
            monthlyPayments.add(month);

        }
        System.out.println(monthlyPayments);

    }
}
