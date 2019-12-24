package day22;

public class ArrayIntro {

    public static void main(String[] args) {

        //syntax for creating variable and assigning value
        //for single item

        int num=10;
        System.out.println(num);
        num=100;

        //syntax for creating variable and assigning value
        //for multiple item
        int [] scores=new int[4];

        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        //updating the value at certain index

        scores[1]=99;
        System.out.println(scores[1]);

        //once array is created with certain size, you cannot change the size!!!!
        //when u create new array object, it will get default value in each element

        int[] numbers=new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


        //create a byte array with size 4
        //store it into a variable called data
        //assign value for each index, print them out for each index
        //update the last value and print again

        byte[] data=new byte[4];
        data[0]=3;
        data[1]=1;
        data[2]=5;
        data[3]=7;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data[3]=9;
        System.out.println(data[3]);



//
//
//        for (int i = 0; i <=3 ; i++) {
//            System.out.println(scores[i]);
//        }




    }
}
