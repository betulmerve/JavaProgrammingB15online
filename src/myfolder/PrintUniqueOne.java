package myfolder;

public class PrintUniqueOne {

    public static void main(String[] args) {

        int[] nums={1,1,2,3,4,3,4};


        for (int x = 0; x <=nums.length-1 ; x++) {
            int count=0;
            for (int y = 0; y <=nums.length-1 ; y++) {
                if (nums[x]==nums[y]) {
                    count++;
                }

            }
            if (count==1) {
                System.out.println(nums[x]);
            }
        }
    }
}
