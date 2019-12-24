package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        //from 1-100 count how many numbers can be divided by 15

        int count=0;

        for (int i = 1; i <=100 ; i++) {
            if (i%15==0) {
                System.out.println(i);
                count=count+1;
                //count+=1;
                //++count;
            }

        }
        System.out.println("count = "+ count);



        //given a string in value
        //find out how many showed in this string

        String name="Betul Merve Faki Cakir";
        int countOfa=0;

        System.out.println(name.charAt(0)=='a');

        for (int x = 0; x <name.length() ; x++) {
            System.out.println(name.charAt(x));

            if (name.charAt(x)=='a') {
                System.out.println("Bingo!");
                ++countOfa;
            }
            
        }
        System.out.println("count of a is: "+ countOfa);
        

    }
}
