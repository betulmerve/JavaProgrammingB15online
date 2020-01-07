package day37;

import java.util.ArrayList;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {

        System.out.println(counting(10));
        System.out.println(counting(20));
    }

    public static ArrayList<Integer> counting(int finalNumber){

        ArrayList<Integer> numList=new ArrayList<>();

        for (int x = 1; x <=finalNumber; x++) {
            numList.add(x);
        }

        return numList;
    }
}
