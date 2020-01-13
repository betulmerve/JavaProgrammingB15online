package myfolder;

import java.util.Arrays;

public class Replit_187 {

    public static void main(String[] args) {

        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","delete","1","")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","none","1","")+"\n"
        );

        System.out.println(lameDb("1aaa#2ccc#3bbb#4zzz","delete","4",""));
    }


    /*
    String db : holds the whole lame database as a string. You will modify this parameter value depending on operation requested

    String op : op is short for operation, the operation the method will do on the database,
    there are 3 : add, edit and delete. For any other operation, return the database as is.

    String id : holds the id of the database row we want to manipulate, we use the id to find the
    database row we want to manipulate

    String data : holds a string of data we will use for the add or edit operations

    example use of the method:

    m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
    returns:  1etsy#2wooden#3spoon#4aaa
    (since operation is 'add', we added '#4aaa' to the end and return)

    m.lameDb("1test#2bla#3foo","edit","2","bbb")
    returns:  1test#2bbb#3foo
    (since operation is 'edit', we edited id 2 to '#2bbb' to the end and return)


    m.lameDb("1tst#2bla#3foo","delete","1","")
    returns:  #2bla#3foo

    m.lameDb("1tst#2bla#3foo","none","1","")
    returns:  1tst#2bla#3foo
     */

    public static String lameDb(String db, String op,String id,String data)
    {

        String[] split=db.split("#");
        String fin="";

        if (op.equals("delete")) {
            split[Integer.parseInt(id)-1]="";
            fin=Arrays.toString(split).replace(", ","#").replace("]","").replace("[","");
            if (fin.endsWith("#")) {
                fin= fin.substring(0,fin.length()-1);
            }
        } else if(op.equals("edit")) {
            split[Integer.parseInt(id)-1]=id+data;
            fin=Arrays.toString(split).replace(", ","#").replace("]","").replace("[","");
        } else if(op.equals("add")) {
            fin=db+"#"+id+data;
        } else {
            fin=db;
        }

        return fin;

    }
}
