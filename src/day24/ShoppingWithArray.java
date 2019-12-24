package day24;

public class ShoppingWithArray {

    public static void main(String[] args) {

        /*
        Create a String array of 6 items to store groceryItems
        {"apple","banana","grape","strawberry","blueberry","kiwi"}
        Create a float array of 6 float values to store prices
        { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
        assume that the order of grocery Items match the prices in same order.
         */

        String [] groceryItems={"apple","banana","grape","strawberry","blueberry","kiwi"};
        float[] prices={ 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f };

        //print everything in one line with arrow
        for (String eachItem:groceryItems) {

            System.out.print(eachItem+" --> ");
        }

        System.out.println();
        //print everything in one line with arrow and dont put an arrow at the end
        //assume you know last item is kiwi

        for (String eachItem:groceryItems) {

            System.out.print(eachItem);

            if(!eachItem.equals(groceryItems[groceryItems.length-1])) {
                System.out.print(" --> ");
            }
        }







    }
}
