package day47;

public class Student {

    //final instance field
    final int studentID;

    //final static field with initial value set
    //this type of field name always suggested to make all uppercase
    //to make it clear that this is public static field that never change
    //other languages has specific term called CONSTANT for this

    //yani Javada Constant diye bir term yok ama public static final deyince o anlama geliyor
    //easily accessible and no change

    //if interview asks how do i define Constant in java?
    // you would say you will create public static final field
    public static final String SCHOOL="Cybertek";

    public Student(int studentID) {
        this.studentID=studentID;
    }

}
