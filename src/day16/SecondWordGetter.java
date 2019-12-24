package day16;

public class SecondWordGetter {

    public static void main(String[] args) {

        // given a sentence with 3 word
        // get the second word

        //second word is between first space and last space

        String sentence="You understand Java";
        String secondWord="";

        int firstSpaceIndex=sentence.indexOf(" ");
        System.out.println(firstSpaceIndex);
        int lastSpaceIndex=sentence.lastIndexOf(" ");
        System.out.println(lastSpaceIndex);
        secondWord=sentence.substring(firstSpaceIndex+1,lastSpaceIndex);
        System.out.println(secondWord);


        //how i get a first word?
        System.out.println(sentence.substring(0,firstSpaceIndex));

        // how i get a last word?
        System.out.println(sentence.substring(lastSpaceIndex+1));
    }
}
