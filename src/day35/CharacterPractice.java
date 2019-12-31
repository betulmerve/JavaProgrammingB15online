package day35;

public class CharacterPractice {

    public static void main(String[] args) {

        String str="A34B123C4X";

        String x="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                x+=str.charAt(i);
            }
        }
        System.out.println(x);

        Integer num=Integer.valueOf(x);//requirement says get the result as Integer object
        System.out.println("num = " + num);




    }
}
