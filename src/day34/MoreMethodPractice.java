package day34;

public class MoreMethodPractice {

    public static void main(String[] args) {

        /*
        We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
        if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling.
        Return true if we are in trouble.
        For example :
        monkeyTrouble(true, true) → true
        monkeyTrouble(false, false) → true
        monkeyTrouble(true, false) → false

         */

        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));

        System.out.println(monkeyTrouble2(true, true));
        System.out.println(monkeyTrouble2(false, false));
        System.out.println(monkeyTrouble2(true, false));

    }

    /**
     * A method that return true only both monkeys are smiling or not smiling
     *
     * @param aSmile first monkey smiling or not
     * @param bSmile second monkey smiling or not
     * @return true only if both monkeys are smiling or not smiling
     */

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        //ben ilk bu sekilde dusunuyorum ama aslinda aSmile==true demeye gerek yok
        //zaten boolean bu yuzden var

        if (aSmile == true && bSmile == true) {
            return true;
        } else if (aSmile == false && bSmile == false) {
            return true;
        } else {
            return false;
        }

//        if ( (aSmile && bSmile) || (!aSmile && !bSmile) ){
//            return true;
//        } else {
//            return false;
//        }

        //bu sekilde de olur

        //return (aSmile && bSmile) || (!aSmile && !bSmile);

        //en kisa ve guzel olan sekli asagidaki

        //return aSmile==bSmile;
    }

    //return yes and no instead of true or false
    public static String monkeyTrouble2(boolean aSmile, boolean bSmile) {

        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return "yes";
        } else {
            return "no";
        }
    }
}
