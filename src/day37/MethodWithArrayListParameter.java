package day37;

import java.util.ArrayList;

public class MethodWithArrayListParameter {

    public static void main(String[] args) {


        ArrayList<String> nameLst = new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");

        printAList(nameLst);
        System.out.println("----------");
        System.out.println(findLongest(nameLst));
    }

    public static void printAList (ArrayList <String> lst) {

        for (String eachItem:lst) {
            System.out.println(eachItem);
        }

    }
    public static String findLongest(ArrayList<String> lst) {
        String longestName=lst.get(0);

        for (int x = 0; x < lst.size(); x++) {

            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if (lst.get(x).length()>longestName.length()) {
                longestName=lst.get(x);
            }

        }
        return longestName;
    }
}
