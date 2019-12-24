package day26;

public class ArrayReview {

    public static void main(String[] args) {


        int[] myNumbers={10,40,20,30,6};
        //i want to add 1 to second item value
        myNumbers[1]=myNumbers[1]+1;
        System.out.println("New value of second item "+myNumbers[1]);
        //i want to double the second item value
        myNumbers[1]=myNumbers[1]*2;
        System.out.println("New value of second item after doubling "+myNumbers[1]);
        //assign 3rd item value to sum of first and second item
        myNumbers[2]=myNumbers[1]+myNumbers[0];
        System.out.println("New value of third item  "+myNumbers[2]);





    }
}
