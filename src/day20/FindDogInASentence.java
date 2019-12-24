package day20;

public class FindDogInASentence {

    public static void main(String[] args) {

        //given sentence, find out the location of the dog

        //our approach is
        //going through the sentence 3 character at a time
        //then if 3 char happen to be dog, we print out the index


        /*
        I l
         li
         lik
         ike

         dly      we need to stop name.length()-3
         */

        String msg="I like Dog , Dogs are cute , Dogs are friendly";
        int dogCount=0;

        for (int i = 0; i <=msg.length()-3 ; i++) {
            //System.out.println(msg.substring(i,i+3));

            if (msg.substring(i,i+3).equalsIgnoreCase("dog")) {
                System.out.println("Bingo! It is a dog! At location "+i);
                dogCount++;

            }

        }
        System.out.println(dogCount);
    }
}
