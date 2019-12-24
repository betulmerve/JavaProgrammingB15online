package day25;

import java.util.Arrays;

public class String_BeforeToCharArray {

    public static void main(String[] args) {

        String name="Alesya";
        //how would you store each and every character
        //to an char array from above name
        //without using method we are about to learn

        char[] nameArray=new char[name.length()];

//        nameArray[0]=name.charAt(0);
//        nameArray[1]=name.charAt(1);
//        nameArray[2]=name.charAt(2);


        for (int x = 0; x <= name.length()-1; x++) {

            nameArray[x]=name.charAt(x);
            //System.out.print(nameArray[x]);

        }

        System.out.println(Arrays.toString(nameArray));

        //tum bu islemi kisaca bu methodla yapabiliriz

        char[] nameArray2=name.toCharArray();
        System.out.println(Arrays.toString(nameArray2));

    }
}
