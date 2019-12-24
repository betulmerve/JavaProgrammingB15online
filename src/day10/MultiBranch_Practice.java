package day10;

public class MultiBranch_Practice {

    public static void main(String[] args) {
        // At the McDonal drive thru

        System.out.println("Welcome to McDonald, what can i get for you?");

        String order="";
        int itemNumber=33;

        if (itemNumber==11) {
            System.out.println("You have selected 11");
            order="Burger";
        } else if (itemNumber==5) {
            System.out.println("You have selected 5");
            order="French Fry";
        } else if(itemNumber==33) {
            System.out.println("You have selected 33");
            order="Ice Cream";
            System.out.println("Yaayy! Enyoj!");
        } else {
            System.out.println("it is known item number");

        }
        System.out.println("Your order is "+order);
    }
}
