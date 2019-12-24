package day15;

public class SubStringPractice {
    public static void main(String[] args) {

        // getting the part of the String out of another String

        //            0123456789012345
        String movie="Lord Of The Ring";

        // i want to get the String <of> from movie

        String wordOf= movie.substring(5,7); //5 ve 6 basiyor 7 basmiyor unutma!!
        // will return starting from beginning index until
        //right before ending index
        System.out.println(wordOf);

        //word=The
        String wordThe=movie.substring(8,11);
        System.out.println(wordThe);

        //word=Lord Of
        String wordLordOf=movie.substring(0,7);
        System.out.println(wordLordOf);

        // get from the second word till last word!
        // find out first space index, second word start right after that
        //ending point one more than last index so it is length

          //            0123456789012345
        //String movie="Lord Of The Ring";

        int startingPoint=movie.indexOf(" ")+1;
        int endingPoint=movie.length();
        System.out.println(startingPoint);
        System.out.println(movie.length());
        System.out.println(movie.substring(startingPoint,endingPoint));

        //second to last

        String secondToLast=movie.substring(5); //duracagi yeri soylemezsen sonuna kadar aliyor
        System.out.println(secondToLast);

        //with this is mind
        // you know the index already
        //              0123456789012345
        //String movie="Lord Of The Ring";
        //reverse Lord of the ring --->>  ring of the lord

        String firstWord=movie.substring(12);
        String secondWord=movie.substring(5,7);
        String thirdWord=movie.substring(8,11);
        String lastWord=movie.substring(0,4);

        System.out.println(firstWord+" "+secondWord+" "+thirdWord+" "+lastWord);

        // reverse like that ===> Ring of The Java Lord

        System.out.println(firstWord+" "+secondWord+" "+thirdWord+" Java "+lastWord);








    }
}
