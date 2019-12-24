package day22;

public class LoopingThroughAnArray {

    public static void main(String[] args) {

        int [] scores=new int[4];

        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;

        //how do we get the size of any Array object?
        //array object has a property called length
        //bu property oluyor

        int itemCount= scores.length;
        int lastItemIndex=itemCount-1;

        //print this array

        for (int x = 0; x <itemCount ; x++) {

            System.out.println(scores[x]);
            
        }

        //print this array in reverse order

        for (int i = lastItemIndex; i >=0 ; i--) {
            System.out.println(scores[i]);

        }

        //how do we get the char count of a String?
        //bu method oluyor, sonunda () var

        String name="Jon Snow";
        int charCount=name.length();
    }
}
