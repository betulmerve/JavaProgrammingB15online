package day47;

public class FinalVariablePractice {

    public static void main(String[] args) {

        //declaring and initializing a variable
        //declaring and assigning initial value
        int x=10;
        //re-assigning new value to the variable
        //storing/giving new value to the variable
        //changing the original value of the variable
        x=100;

        //declaring and initializing a final variable
        //declaring and assigning initial value to a final variable
        final int a=20;
        //re-assigning new value to the variable--ERROR!
        //a=30;


        final Student s1=new Student(101);
        System.out.println(s1);

        //can not reassign the new value
        //because it is final
        //s1=new Student(102); it can not work

        //you can still change internal data attached to the object
        // as long as it is the same object s1 pointing to
        // as long as the address does not change
        //s1.studentID=200;
        //System.out.println(s1);
        System.out.println(s1.studentID);


        //Student.school="abc";
        //can not reassing value because it is final
        System.out.println(Student.SCHOOL);


        // INTELLIJ AUTOMATICALLY RECOGNIZE CONSTANT (public static final field)
        // it will automatically make it italic (This can not be done by programmer)
        // easy way to distinguish between fields and methods is
        // by looking at () at the end
        System.out.println(Byte.MAX_VALUE);

        //PI in Java
        System.out.println(Math.PI);

        printDoubledNumber(12);

        final String name = "Michael";
        // name = "Zehra";  this will not work , can not be reassigned

    }

    //anywhere we declare a variable we have option to make it final (including method parameter)
    //making method parameter final
    //it will make the method only use the argument user passed without modifying it

    public static void printDoubledNumber(final int x) {

        //x=x*2;
        System.out.println("x = "+ x*2);

    }
}
