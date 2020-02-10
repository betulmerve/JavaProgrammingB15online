package day55.association2;

import java.util.ArrayList;
import java.util.List;

public class CourseXRunner {

    public static void main(String[] args) {


        List<Student> myList=new ArrayList<>();
        myList.add(new Student("Muge",101));
        myList.add(new Student("Hasan",102));
        myList.add(new Student("Zehra",103));
        myList.add(new Student("Ayse",104));
        myList.add(new Student("Fatih",105));



        CourseX c1=new CourseX("HAS-A",myList);

        c1.addStudent(new Student("Ayjeren",106));
        c1.addStudent("Sezgin",107);
        System.out.println("c1 = " + c1);


    }
}
