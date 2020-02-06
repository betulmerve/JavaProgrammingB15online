package office_hour;

public abstract class ScrumTeam {

    String employeeName;
    String jobTitle;
    double salary;

    public abstract void demo();
    public abstract void dailyStandUp();

    public void employeeInfo() {
        System.out.println("Employee name is: "+ employeeName+" Job title is: "+ jobTitle+ " Salary is: "+ salary);
    }

}
