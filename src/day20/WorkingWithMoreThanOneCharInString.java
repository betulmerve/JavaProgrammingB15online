package day20;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args) {

        //given a String with even num character count
        // print 2 characters in one line
        //               01234567
        // for example : Gokyuzum
        /*
        Go  01  (0,2)
        ky  23  (2,4)
        uz  45  (4,6)
        um  67  (6,8)    //8 is name.length()
         */
        //temel mantik
        //print 2, then shift 2 and print again, shift 2 and print again
        // nerde baslayip nerde duracagiz?
        //0 dan baslayacagiz fakat name.length()-2 de duracagiz yani
        // son karakterden bi once

        String name="Gokyuzum";
        int charCount=name.length();

//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(2,4));
//        System.out.println(name.substring(4,6));
//        System.out.println(name.substring(6,8));

//        int x=0;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));

        for ( int x = 0; x <=charCount-2 ; x=x+2) {

            System.out.println(name.substring(x,x+2));

        }




    }
}
