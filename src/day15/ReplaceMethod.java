package day15;

public class ReplaceMethod {

    public static void main(String[] args) {

        // replace method of the String

        String message="I love Pumpkin, Pumpkin IS FUN!" ;

        message=message.replace("Pumpkin","Java") ;
        // match eden tum kelimeleri degistiriyor String icindeki

        System.out.println(message);


        //i want to turn Thanks Giving to Thanksgiving

        String message2="Happy Thanks Giving to All!";
        message2=message2.replace("Thanks Giving","Thanksgiving");
        System.out.println(message2);


        //what if i want to replace space from every where
        message=message.replace(" ","");
        System.out.println(message);

        String message3="TOMORROW IS OFF NO!";
        message3=message3.replace("NO","");
        System.out.println(message3);
    }
}
