package myfolder;

import java.util.Scanner;

public class ShoppingList2 {

    public static void main(String[] args) {

//        int x=1;
//
//        do {
//            System.out.println(x);
//            ++x;
//        } while (x<6) ;

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        do {
            System.out.println("Enter Item"+count+" and its price:");
            item=scan.next();
            price=scan.nextDouble();
            System.out.println("Add one more item?");
            countinue=scan.next();
            shoppingListReport=shoppingListReport+"Item"+count+": "+item+" Price: "+price+", ";
            count++;
            totalPrice=totalPrice+price;
            if(count>10) {
                break;
            }
        }while (countinue.equalsIgnoreCase("yes"));

        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
        System.out.println("Total Price: "+totalPrice);



    }
}
