package myfolder;

public class ReturnWord {

    public static void main(String[] args) {

        System.out.println(getword("aaaabbcccdda"));
                            //a4b2c3d2a
        System.out.println(noDup("aaaabbcccdda"));
                            //abcd


    }

    public static String getword(String word) {

        int countOfLetter=1;
        String result="";

        for (int x = 0; x < word.length()-1; x++) {

            if (word.charAt(x)==word.charAt(x+1)) {
                countOfLetter++;
                continue;

            } else {

                result=result+word.charAt(x)+countOfLetter;
            }

            countOfLetter=1;

        }

        result=result+word.charAt(word.length()-1);

        return result;

    }

    public static String noDup(String word) {

        String result="";

        for (int x = 0; x < word.length(); x++) {

            if (!result.contains(""+word.charAt(x))) {
                result=result+word.charAt(x);
            } else {
                continue;
            }

        }

        return result;


    }
}
