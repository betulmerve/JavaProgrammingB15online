package java_interview_coding_tasks;

public class String_RemoveDuplicates {

    /*
    Write a return method that can remove the duplicated values from String

    Ex:  removeDup("AAABBBCCC")  ==> ABC
     */
    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));

    }

   public static String removeDup(String str) {
        String noDup="";
       for (int x = 0; x < str.length(); x++) {

           if (!noDup.contains(""+str.charAt(x))) {
               noDup=noDup+str.charAt(x);
           }

       }
        return noDup;
   }
}
