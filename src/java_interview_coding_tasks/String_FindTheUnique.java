package java_interview_coding_tasks;

public class String_FindTheUnique {

    /*
    Write a return  method that can find the unique characters from the String

    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }

    public static String unique(String str) {
        String uniqOnly="";
        for (int x = 0; x < str.length(); x++) {
            int count=0;
            for (int y = 0; y < str.length(); y++) {
                if (str.charAt(x)==str.charAt(y)) {
                    count++;
                }
            }
            if (count==1) {
                uniqOnly=uniqOnly+str.charAt(x);
            }
        }

        return uniqOnly;
    }
}
