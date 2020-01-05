package day36;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        // create a ArrayList object of long and assign it to a variable
        ArrayList<Long> lst=new ArrayList<>();
        //        C.R.U.D.
//                Create, Read, Update, Delete
        // add item ,insert an item ,  read item , update the item , remove the item , check the location ...

        lst.add(12L);
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        lst.add(null); //you can add null element into a list
        System.out.println("lst = " + lst);
        //I want to insert 125L between 100L and 150L, basically 2nd and 3rd item
        lst.add(2,125L);
        System.out.println("lst = " + lst);

        System.out.println("lst.get(3) = " + lst.get(3));

        //updating value at certain index: set method
        lst.set(3,195L);
        System.out.println("New value for lst.get(3) = " + lst.get(3));

//        //removing item by its value
//        lst.remove(100L);
//        System.out.println("lst = " + lst);
//        //removing item by its index
//        lst.remove(2);
//        System.out.println("lst = " + lst);

        //looking for location of certain item
        System.out.println("Location of 100L is "+ lst.indexOf(200L));
        System.out.println("Location of 23L is "+ lst.indexOf(23L));

        //check whether a list is empty or not
        System.out.println("(lst.size()>0) = " + (lst.size() > 0));
        System.out.println("lst.isEmpty() = " + lst.isEmpty());

//        //how do i delete everything inside my ArrayList
//        lst.clear();
//        System.out.println("check after clearing lst.isEmpty() = " + lst.isEmpty());

        //check whether we have certain item or not
        System.out.println("lst.contains(100L) = " + lst.contains(100L));
        //how do i check whether a list contains an item without using contains
        //use index of method, if it return -1 it means we dont have it
        System.out.println("do i have 10L = " + (lst.indexOf(10L)!=-1)  );









    }
}
