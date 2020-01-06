package day37;

import java.util.ArrayList;

public class WarmUpTask {
    public static void main(String[] args) {

        ArrayList<String> teamMates=new ArrayList<>();

        teamMates.add("Merve");
        teamMates.add("Bilal");
        teamMates.add("Ali");
        teamMates.add("Aysenur");
        teamMates.add("Alperen");
        teamMates.add("Ibrahim");

        System.out.println("teamMates = " + teamMates);

        //print one by one

        for (String each:teamMates) {

            System.out.print(each+" ");

        }

        System.out.println();
        //print reverse

        for (int x = teamMates.size()-1; x >=0 ; x--) {

            System.out.print(teamMates.get(x)+" ");

        }

        System.out.println();
        //print first and last

        System.out.println("First item is: "+teamMates.get(0));
        System.out.println("Last item is: "+teamMates.get(teamMates.size()-1));
        System.out.println();

        //print 2 at a time   1-2   2-3   3-4.....

        for (int i = 0; i < teamMates.size()-1; i++) {

            System.out.println(teamMates.get(i)+" "+teamMates.get(i+1));

        }

        //print 2 at a time   1-2   3-4.....
        for (int i = 0; i < teamMates.size()-1; i+=2) {

            System.out.println(teamMates.get(i)+" "+teamMates.get(i+1));

        }

        //print 3 at a time   1-2-3   4-5-6.....
        for (int i = 0; i < teamMates.size()-1; i+=3) {

            System.out.println(teamMates.get(i)+" "+teamMates.get(i+1)+" "+teamMates.get(i+2));

        }

        //concat everyone in one string separated by -

        String everyone="";

        for (int x = 0; x < teamMates.size()-1; x++) {
            everyone=everyone+teamMates.get(x)+"-";
        }

        System.out.println(everyone+teamMates.get(teamMates.size()-1));

        //How can we turn a List into a String and Store it and manipulate it ?
        // Any collection type including ArrayList
        // has toString method to show what's inside and return it as String
        // TIP : Do not use this to manipulate ArrayList items

        String lstToString=teamMates.toString();
        System.out.println("lstToString = " + lstToString);
        System.out.println("After replacement= "+lstToString.replace(", ","-")
                .replace("[","").replace("]",""));
    }
}
