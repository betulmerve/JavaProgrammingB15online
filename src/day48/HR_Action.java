package day48;

public class HR_Action {

    public static void main(String[] args) {

        FullTimeEmployee e1=new FullTimeEmployee("bilal",102,6000);
        HourlyEmployee h1=new HourlyEmployee("merve",101,80,400);

        System.out.println("h1 = " + h1);
        System.out.println("e1 = " + e1);

        e1.calculateAnnualSalary();
        h1.calculateAnnualSalary();


    }
}
