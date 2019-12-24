package day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {

        /*
        amazon prime member   free shipping
        not prime member  has to pay 5$ for shipping unless cost is more than 25$ free shipping

         */

        String memberType="Prime member";
        double amount=15.99d;
        int shippingFee;


        if(memberType.equalsIgnoreCase("prime member")) {

            System.out.println("You get 1 day free shipping");
            System.out.println("Your final price is "+ amount);

        } else if (amount>25) {

            System.out.println("not a prime member but order is more than 25");
            System.out.println("you got free shipping on amount "+amount);
        }  else {
            System.out.println("Do you wanna sign up for prime membership?");
            shippingFee=5;
            amount=amount+shippingFee;
            // amount+=shippingFee;
            System.out.println("your final price is "+amount);
        }

    }
}
