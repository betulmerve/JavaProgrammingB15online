package day20;

public class ReversingAString {

    public static void main(String[] args) {

        //so popular interview question!!

        //given a String variable name with value
        //reverse this name and store reversed value into
        //another String variable reversedName


        String name="Jon Snow";
        String reversedName="";


        for (int i = name.length()-1; i >=0 ; i--) {
            //System.out.print(name.charAt(i));
            reversedName=reversedName+name.charAt(i);

        }
        System.out.println(reversedName);


    }
}
