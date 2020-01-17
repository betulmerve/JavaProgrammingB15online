package myfolder;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;

public class Replit_216 {

    public static void main(String[] args) {


//        ArrayList<String> str=new ArrayList<>(Arrays.asList("one apple","two orange","four banana"));
//
//        System.out.println(search(str,"one"));

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(9,1,1));

        System.out.println(refuel_times(list,3));
    }


    public String blogDb(ArrayList<String[]> r, String id)  {

        String result="";
        for (int x = 0; x < r.size(); x++) {

            for (int y = 0; y < 3; y++) {

                if (r.get(x)[y].equals(id)) {
                    result=r.get(x)[1]+ "\n"+ r.get(x)[2];
                }
            }
            
        }

        return result;

    }


    public static ArrayList<Integer> twoTimes(ArrayList<Integer> lst) {

        ArrayList<Integer> newLst=new ArrayList<>();



            for (int y = 0; y < lst.size(); y++) {

                for(int x=1; x<3; x++ ) {

                newLst.add(lst.get(y));

            }

        }

        return newLst;


    }


    public static String search(ArrayList<String> r, String find)
    {

        String result="search failed";
        for (int x = 0; x < r.size(); x++) {

            if (r.get(x).contains(find)) {
                result=r.get(x);
            }

        }

        return result;


    }//end wineSeller

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n)
    {

       while (r.contains(n)) {
           r.remove(n);
       }

        return r;

    }

    /*
        refuel_times([7,7,7],7)
        returns:3 (3 fuel stops 7 units each delivery)

        refuel_times([9,1],3)
        returns:4 (3 fuel stops for first delivery and +1 stop for second)

        refuel_times([100,200,10],10)
        returns:31
     */
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel)
    {
        int count=0;

        for (int x = 0; x < deliveries.size(); x++) {

            if (max_fuel<=deliveries.get(x)) {

                count=count+(deliveries.get(x)/max_fuel);
            } else {
                count=count+deliveries.get(x);
            }


        }

        return count;

    }
}
