package day15;

public class ReversingAString {

    public static void main(String[] args) {

        // interviewde cok soruyorlarmis
        // bu tabi ki length bildigin zaman mantikli
        // bilmiyorsan ne yapacagni sonra ogrenecegiz

        String name="Merve";

        System.out.print(name.charAt(4));
        System.out.print(name.charAt(3));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(1));
        System.out.println(name.charAt(0));


        System.out.println(name.charAt(4) +" "+name.charAt(3)+ " "+
                name.charAt(2)+ " "+name.charAt(1) +" "+name.charAt(0));

        // how to find a last character of a String?
        // length -1 yaparsan bulursun

        int nameLength=name.length();
        int lastCharIndex=nameLength-1;
        System.out.println(name.charAt(lastCharIndex));


        System.out.println(name.charAt(nameLength-1));
    }
}
