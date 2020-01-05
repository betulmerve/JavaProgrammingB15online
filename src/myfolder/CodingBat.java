package myfolder;

public class CodingBat {

    public static void main(String[] args) {

        /*
        withouEnd2("Hello") → "ell"
        withouEnd2("abc") → "b"
        withouEnd2("ab") → ""
         */
        /*
        countCode("aaacodebbb") → 1
        countCode("codexxcode") → 2
        countCode("cozexxcope") → 2
         */
        System.out.println(middleTwo("string"));
        System.out.println(countCode("cozexxcope"));
        System.out.println(catDog("catcatdog"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(xyzThere("xyz.abc"));
        System.out.println(bobThere("abcbob"));
        System.out.println(xyBalance("bbb"));
        System.out.println(mixString("hi","there"));
    }

    public static String middleTwo(String str) {
        int length=str.length();
        return ""+str.charAt((length/2)-1)+str.charAt(length/2);
    }

    public static int countCode(String str) {

        int count=0;
        for (int x = 0; x < str.length()-3; x++) {
            if (str.charAt(x)=='c' && str.charAt(x+1)=='o' && str.charAt(x+3)=='e') {
                    count++;
            }

        }
        return count;
    }

    /*
    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true
     */
    public static boolean catDog(String str) {

        int countOfCat=0;
        int countOfDog=0;
        for (int x = 0; x < str.length()-2; x++) {
            if (str.charAt(x)=='c' && str.charAt(x+1)=='a' && str.charAt(x+2)=='t') {
                countOfCat++;
            }
            if (str.charAt(x)=='d' && str.charAt(x+1)=='o' && str.charAt(x+2)=='g') {
                countOfDog++;
            }

        }
        return countOfCat==countOfDog;
    }

    /*
    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true
     */
    public static boolean endOther(String a, String b) {


        if (a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean xyzThere(String str) {

        for (int x = 0; x < str.length()-2; x++) {

            if(x==0 && str.charAt(x)=='x' && str.charAt(x+1)=='y' && str.charAt(x+2)=='z') {
                return  true;
            }
            if(str.charAt(x)=='x' && str.charAt(x+1)=='y' && str.charAt(x+2)=='z' && str.charAt(x-1)!='.') {
                return true;
            }
        }
        return false;
    }

    public static boolean bobThere(String str) {

        for (int x = 0; x < str.length()-2; x++) {
            if (str.charAt(x)=='b' && str.charAt(x+2)=='b') {
                return true;
            }

        }
        return false;
    }

    public static boolean xyBalance(String str) {

        if (str.endsWith("x")) {
            return false;
        }
        if (!str.contains("x")) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='x') {
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(j)=='y') {
                        return true;
                    }

                }
            }

        }
        return false;
    }

    public static String mixString(String a, String b) {

        String bigger="";
        if (a.length()<b.length()) {
            for (int i = 0; i < a.length(); i++) {
                bigger=bigger+a.charAt(i)+b.charAt(i);
            }
        } else {
            for (int j = 0; j < b.length(); j++) {
                bigger=bigger+a.charAt(j)+b.charAt(j);

            }
        }
        return bigger;

    }

}
