package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {

        //creating an array in second way

        int[] ages=new int[] {3,5,11,33,57,18};

        //bu sekilde de sonradan atama yapabiliriz
//        int[] ages;     //we are only declaring a variable
//        ages= new int[]{3, 5, 22, 44, 56, 78};  //then we are assigning a value


        int itemCount=ages.length;
        System.out.println("itemCount = " + itemCount);

        for (int i = 0; i <ages.length ; i++) {

            System.out.println(ages[i]);

        }

        //the most laziest way is this
        //but if do it this way:it must happen in one line together
        int[] areaCodes={703,300,954,665,};

        for (int i = 0; i <areaCodes.length ; i++) {

            System.out.println(ages[i]);

        }


    }
}
