package day26;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class SwappingValues {

    public static void main(String[] args) {

        String name1="Emma";
        String name2="Jason";

        //name2 should have Emma, name1 should have Jason

        String tempContainer=name1;  //Emma

        name1=name2; //Jason

        name2=tempContainer;

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);


        //swap the value of first and last item
        int[] myNumber={10,40,30,7};

        int temp=myNumber[0]; //10
        myNumber[0]=myNumber[3]; //7
        myNumber[3]=temp; //10

        System.out.println(Arrays.toString(myNumber));

        //swap third and forth

        temp=myNumber[2];
        myNumber[2]=myNumber[3];
        myNumber[3]=temp;

        System.out.println(Arrays.toString(myNumber));


        //the result of swapping --> reversed array

        //cut it in the middle and start swapping from sides
        //how did i come up with 0 to 3
        //how did i come up with 0+1=1 to 3-1=2
        //loop yapmak istioruz o yuzden sekilde ilerlemeye calisiyoruz







    }
}
