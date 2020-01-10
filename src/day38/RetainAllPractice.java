package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllPractice {

    public static void main(String[] args) {

        //retain means: tutmak, korumak

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(100);
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);
        nums1.add(500);
        nums1.add(600);
        System.out.println("nums1 = " + nums1);

        List<Integer> nums2=new ArrayList<>(Arrays.asList(200,300,600,700,800));

        //we kept whatever is in commmon
        //sadece ortak olanlari tuttuyor
        nums1.retainAll(nums2);
        System.out.println("nums1 = " + nums1);

        nums2.retainAll(nums1);
        System.out.println("nums2 = " + nums2);

        //in order to whether check 2 List Object has same elements we can use .equal
        System.out.println("does nums1 has the same elements as nums2 = " +nums1.equals(nums2));







    }
}
