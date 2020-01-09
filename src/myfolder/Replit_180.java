package myfolder;

import java.util.ArrayList;

public class Replit_180 {

    public static void main(String[] args) {

        System.out.println(coverString("java methods", "me") ) ; //java [me]thods
        System.out.println(reverse("student"));  //tneduts
        System.out.println(combineRs(new String[]{"f","o","o"}, new String[]{" b","a","r"}));


    }

    public static String coverString(String main, String coverME) {

        if (main.contains(coverME)) {

            String covered= main.replace(coverME,"["+coverME+"]");
            return covered;
        } else {
            return "["+main+"]";
        }

    }
    /*
        if (main.contains(coverME)) {

            String covered= main.replace(coverME,"["+coverME+"]");
            return covered;
        } else {
            return "["+main+"]";
        }
     */

    public static String reverse(String input) {
        String reversed="";

        for (int x = input.length()-1; x >=0 ; x--) {
            reversed=reversed+input.charAt(x);

        }

        return reversed;

    }

    public static String combineRs(String[] r1,String[] r2)
    {
        ArrayList<String> comb=new ArrayList<>();

        for (int x = 0; x < r1.length; x++) {

            comb.add(r1[x]);

        }

        for (int y = 0; y <r2.length ; y++) {
            comb.add(r2[y]);

        }


        String combined="";
        for (int z = 0; z < comb.size(); z++) {
            combined=combined+comb.get(z);

        }
        return combined;




    }
}
