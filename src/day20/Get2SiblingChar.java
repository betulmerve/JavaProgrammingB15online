package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        // print 2 char in one line as below
        // for example: Arya
        /*
        Ar
        ry
        ya
         */

        String name="Arya";

        for (int i = 0; i <=name.length()-2 ; i++) {
            System.out.println(name.substring(i,i+2));

        }

        //print 3 char
        //name:Arya
        /*
        Ary
        rya
         */

        for (int i = 0; i <=name.length()-3 ; i++) {
            System.out.println(name.substring(i,i+3));

        }
    }
}
