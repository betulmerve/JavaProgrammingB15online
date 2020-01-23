package java_interview_coding_tasks;

public class String_FrequencyOfCharacters {

    /*
    Write a return method that can find the frequency of characters

    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCDD"));
    }

    public static String frequencyOfCharacters(String str) {

        String nonDup="";
        String result="";

        for (int x = 0; x < str.length(); x++) {

            if (!nonDup.contains(""+str.charAt(x))) {

                nonDup=nonDup+str.charAt(x);
            }
        }

        for (int y = 0; y < nonDup.length(); y++) {
            int count=0;
            for (int z = 0; z < str.length(); z++) {

                if (nonDup.charAt(y)==str.charAt(z)) {
                    count++;
                }

            }
            result=result+nonDup.charAt(y)+count;
        }

        return result;

    }
}
