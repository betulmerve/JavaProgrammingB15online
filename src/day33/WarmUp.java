package day33;

public class WarmUp {

    public static void main(String[] args) {


        System.out.println(getSpelledName("Merve"));

        String spelledName=getSpelledName("Ali");
        System.out.println("spelled name is "+spelledName);

        System.out.println(getSpelledName2("Merve"));
    }

    /*
    getSpelledName
    this method will put dash in between given String
    for example
    Merve --> M-e-r-v-e
     */

    public static String getSpelledName(String name) {

      String result="";
        for (int i = 0; i < name.length(); i++) {

            result=result+name.charAt(i);
            if (i==name.length()-1) {
                continue;
            } else {
                result=result+"-";
            }

        }

        return result;
    }
    //ustteki evet dogru ama eger 1milyon harf uzunlugu varsa hepsi icin check yaomasi gerekir
    //otomasyonda bunlar onemli oyle olsun istemiyorsan bu sekilde de bir program yazabilirin

    public static String getSpelledName2(String name) {
        String result="";
        for (int i = 0; i < name.length()-1; i++) {

             result+= name.charAt(i)+"-";

        }
        return result+=name.charAt(name.length()-1);
    }
}
