package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int myFavNumber=300;
        int yourFavNumber=myFavNumber;

        long[] nums={10,40,20};

        for (int x = 0; x < 3; x++) {
            nums[x]=nums[x]*2;
        }
        //after we modified the value
        for (int x = 0; x < 3; x++) {
            System.out.println(nums[x]);
        }

        //burda bizim array degismiyor cunku onu etkileyen bi durum yok
        for (int x = 0; x < 3; x++) {
            long eachItem = nums[x];
            eachItem = 100;
            System.out.println(nums[x]);
        }
        //for each loop kullanirsak da durum boyle bizim arrayi etkilemiyor

        for (long eachItem:nums) {

            eachItem=100;

        }
        //NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS!!
        //YOU ARE JUST COPING NOT MODIFYING DON FORGET!!
        //interview question olabilir

    }
}
