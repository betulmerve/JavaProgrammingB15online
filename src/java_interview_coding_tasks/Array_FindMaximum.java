package java_interview_coding_tasks;

public class Array_FindMaximum {

    /*
    Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {

        System.out.println(findMax(new int[]{1,2,3,4,5,6}));
        System.out.println(findMax(new int[]{72,23,35,54,65,68}));
    }

    public static int findMax(int[] arr) {
        int max=arr[0];
        for (int x = 0; x < arr.length; x++) {
            if (arr[x]>max) {
                max=arr[x];
            }
        }
        return max;
    }
}
