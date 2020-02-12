package office_hour.muhtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                '}';
    }
}

class School{
    String schoolName;
    List<Student> allStudentsList;

    public School(String schoolName, List<Student> allStudentsList) {
        this.schoolName = schoolName;
        this.allStudentsList = allStudentsList;
    }

    public void addNewStudent(Student s) {
        allStudentsList.add(s);
    }
}

class AssociationExample{

    public static void main(String[] args) {

        Student s1=new Student("Muge");
        Student s2=new Student("Sofiya");
        Student s3=new Student("Hasan");
        Student s4=new Student("Parvin");
        Student s5=new Student("Akbar");

        List<Student> cybertekStudents=new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));

        School sc1=new School("Cybertek",cybertekStudents);


        sc1.addNewStudent(new Student("Denis"));
        sc1.addNewStudent(new Student("Irina"));


        for (Student each:sc1.allStudentsList) {

            System.out.println("each = " + each);

        }

    }
}

