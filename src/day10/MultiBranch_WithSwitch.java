package day10;

public class MultiBranch_WithSwitch {

    public static void main(String[] args) {

        String order="";
        int itemNumber=35;
        // you can just use
        //byte, char, short, int, String

        switch (itemNumber) {
            case 11:
                System.out.println("You have selected 11");
                order="Burger";
                break;
            case 5:
                System.out.println("You have selected 5");
                order="French Fry";
                break;
            case 8:
                System.out.println("You have selected 8");
                order="Nuggets";
                break;
            case 35:
                System.out.println("You have selected 35");
                order="Ice Cream";
                System.out.println("Yaay! Enjoy!");
                break;
            default:
                System.out.println("You have selected unknow item");
                order="Unknown";
        }
        System.out.println("Your order is "+order);
    }
}
