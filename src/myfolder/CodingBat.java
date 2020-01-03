package myfolder;

public class CodingBat {

    public static void main(String[] args) {

        /*
        withouEnd2("Hello") → "ell"
        withouEnd2("abc") → "b"
        withouEnd2("ab") → ""
         */
        System.out.println(middleTwo("string"));
    }

    public static String middleTwo(String str) {
        int length=str.length();
        return ""+str.charAt((length/2)-1)+str.charAt(length/2);
    }
}
