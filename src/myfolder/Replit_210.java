package myfolder;

public class Replit_210 {

    public static void main(String[] args) {


        String word="a,b$c";

        String newWord = "";

        String reverseJustWords = "";

        for (int x = word.length() - 1; x >= 0; x--) {
            if (Character.isLetter(word.charAt(x))) {
                reverseJustWords += "" + word.charAt(x);
            }
        }

        int indexOfReverse = 0;

        for (int x = 0; x < word.length(); x++) {
            if (!Character.isLetter(word.charAt(x))) {
                newWord += "" + word.charAt(x);
            } else {
                newWord += "" + reverseJustWords.charAt(indexOfReverse);
                indexOfReverse++;
            }
        }

        System.out.println(newWord);
    }

}
