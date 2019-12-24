package day23;

public class WarmUp_Array {

    public static void main(String[] args) {

        //create an int array of 7 items
        //assign a value,
        // 1, print out in reverse order
        //2, store last item in a variable called last item and print out
        //3, print item right in the middle

        //4, find sum, find average, find min, find max
        //5, double the value of each items in the array

        //first way to create an object

        int[] nums=new int[7];

        nums[0]=11;
        nums[1]=2;
        nums[2]=23;
        nums[3]=4;
        nums[4]=53;
        nums[5]=6;
        nums[6]=3;

        //second way

        int[] nums2=new int[]{11,2,23,4,53,6,3};

        //third way

        int[] nums3={11,2,23,4,53,6,3};


        //reverse print
        int[] trio={15,25,35,45,55,65,75};

        for (int i = trio.length-1; i >=0 ; i--) {

            System.out.println("index "+i+" : "+trio[i]);

        }
        //lastitem index

        int lastItemIndex=trio.length-1;
        int lastItem=trio[lastItemIndex];
        System.out.println("Last item value "+lastItem);

        //middle item
        System.out.println("Middle item value: "+trio[trio.length/2]);

        //finding sum

        int sum=0;
        for (int i = 0; i <=trio.length-1 ; i++) {

            sum=sum+trio[i];

        }
        System.out.println("Sum is "+sum);

        //finding average
        System.out.println("Average is "+sum/trio.length);

        //finding max
        int max=trio[0];

        for (int i = 0; i <=trio.length-1; i++) {

            if(max>trio[i]) {
                max=max;
            } else {
                max=trio[i];
            }

        }

        System.out.println("Max value is "+max);

        //finding min
        int min=trio[0];

        for (int i = 0; i <=trio.length-1 ; i++) {

            if(min<trio[i]) {
                min=min;
            } else
                min=trio[i];

        }
        System.out.println("Min value is "+min);


        //double all values
        for (int i = 0; i <=trio.length-1 ; i++) {

            trio[i]=trio[i]*2;
            System.out.println("index "+i+": "+trio[i]);

        }







    }
}
