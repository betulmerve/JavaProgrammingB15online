package day55.association2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {


        List<String> lst = new ArrayList<>(Arrays.asList("Muge", "Sumeyye","Hasan","Astrit","Vlad","Zehra") ) ;

        Course java=new Course("Java",lst);
        System.out.println("java = " + java);

//        java.studentNames.add("Gail");
//        java.studentNames.add("Ayse");
        java.studentNames.addAll(Arrays.asList("Serife","Soylu","Israfil"));
        java.addStudent("Gail");
        java.addStudent("Ayse");
        java.addMultipleStudent(Arrays.asList("Merve","Bilal","Ali"));

        //ekledigimizde orijinal lst de degisiyor
        //cunku baska list yok zaten elimizde, biz ekledigimiz zaman
        //burasi neyi point ediyor diye bakiyor ve liste gdip ekleme yapiyor

        System.out.println("java = " + java);
        System.out.println("student names = " + java.studentNames);
        System.out.println("my original lst = " + lst);
    }


}
