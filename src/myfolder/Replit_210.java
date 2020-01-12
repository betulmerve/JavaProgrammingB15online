package myfolder;

public class Replit_210 {

    public static void main(String[] args) {



        String word="Mer,v$e";

        String reversed="";

        for (int x = word.length()-1; x >=0 ; x--) {

            if (Character.isLetter(word.charAt(x))) {
                reversed=reversed+word.charAt(x);
            }

        }

        System.out.println(reversed);

        int count=0;

        for (int x = 0; x <word.length() ; x++) {

            if (Character.isLetter(word.charAt(x))) {
                word=word.substring(0,x)+reversed.charAt(count)+word.substring(x+1);
                count++;
            }

        }

        System.out.println(word);


    }


    public static String reverseLetters(String word){
        //TODO

        String reversed="";

        for (int x = word.length()-1; x >=0 ; x--) {
            reversed=reversed+word.charAt(x);

        }



        return word;
    }
}
