package day35;

public class ParsingPractice {

    public static void main(String[] args) {

        String sentence = "I bought 3 tomato and the price was 3,14 each";
        // How much is your final checkout price
        // The count is always 3rd word
        // The price is always at 2nd word from the last

        String[] splitSentence=sentence.split(" ");
        int count=Integer.parseInt(splitSentence[2]);
        double price=Double.parseDouble(splitSentence[splitSentence.length-2].replace(",","."));
        System.out.println("Your check out price is :" +(count*price));


    }
}
