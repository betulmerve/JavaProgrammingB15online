package day35;

public class WarmUpTaskFromMuhtar {

    public static void main(String[] args) {
        System.out.println(frequency("AAABBB", 'A'));
        System.out.println(removeDup("aaabbbccc"));
        System.out.println(frequencyOfChars("AAABBBCCC"));

    }

    /*
        2. write a return method called Frequency that accepts String and  char,
    the method will return the total number of ocuurence of the given char in the given string
    Ex:
        Frequency("AAABBB", 'A') ==> 3
     */

    public static int frequency(String str, char character) {

        int count=0;
        for (int x = 0; x < str.length(); x++) {

            if (str.charAt(x)==character) {
                count++;
            }
        }
        return count;
    }

    /*
          1.  write a return method called RemoveDup that accepts a String and
        removes duplicate values from the String
    Ex:
        RemoveDuplicate("aaabbbccc") ==> "abc"
     */

    public static String removeDup(String str) {
        String dupRemoved="";
        for (int i = 0; i < str.length(); i++) {

            if (!dupRemoved.contains(""+str.charAt(i))) {
                dupRemoved=dupRemoved+str.charAt(i);
            }

        }
        return dupRemoved;
    }

        /*

    3. Combined the methods 1 & 2 to write a method that prints the
    the frequency of each characters from the given String
    Ex:
        FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"
     */

        public static String frequencyOfChars(String str) {

            String result="";
            String dupRemoved=removeDup(str);

            for (int i = 0; i <dupRemoved.length() ; i++) {
                int count=frequency(str,dupRemoved.charAt(i));
                result=result+dupRemoved.charAt(i)+count;
                
            }

            return result;
            

        }
}
