package day35;

public class CharacterPractice2 {

    public static void main(String[] args) {

        //ADDITIONALLY GET THE SUM OF THE NUMBERS INSIDE A STRING
        //OPTIONALLY MAKE IT A METHOD

        //VERY TYPICAL INTERVIEW QUESTION!!

        //Plain English logic
        //for each char in string check if it is number
        // if yes store in a String and use that string to get Integer
        // then sum it up

        System.out.println(getTheSumOfNumFromString("A34B123C4X"));
        System.out.println(secondTryForSameResult("A34B123C4X"));


    }

    public static String getTheSumOfNumFromString(String str) {

        //String strNum="";
        int sum=0;
        for (int x = 0; x <str.length() ; x++) {
            if (Character.isDigit(str.charAt(x))) {
                //strNum=strNum+str.charAt(x);
                sum=sum+Integer.parseInt(Character.toString(str.charAt(x)));
            }

        }
        String sumStr=String.valueOf(sum);
        return sumStr;
    }

    public static String secondTryForSameResult(String str) {

        char[] allChars=str.toCharArray();

        int sum=0;

        for (char each:allChars) {

            if (Character.isDigit(each)) {
                sum=sum+Integer.parseInt(each+"");
            }
        }
        String sumStr=String.valueOf(sum);
        return sumStr;
    }
}
