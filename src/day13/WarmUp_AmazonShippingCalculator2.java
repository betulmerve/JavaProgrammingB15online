package day13;

public class WarmUp_AmazonShippingCalculator2 {

    public static void main(String[] args) {

        /*
        amazon prime member   free shipping
        not prime member  has to pay 5$ for shipping unless cost is more than 25$ free shipping

         */

        boolean youWantToShop= true;
        String preference="Online";

        // if(youWantToShop)  you can say that
        if(youWantToShop==true) {
            if (preference.equals("Store")) {
                System.out.println("going to store for shopping");
            } else {
                System.out.println("going to online for shopping");
            }

        } else {
            System.out.println("good job stay at home and coding!!");
        }



    }
}
