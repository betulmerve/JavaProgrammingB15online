package office_hour;

public class Developers extends ScrumTeam {

    public Developers(String employeeName, String jobTitle, double salary) {
        this.employeeName=employeeName;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }
    public void fixingBug() {
        System.out.println("Bug is fixing");
    }
    @Override
    public void demo() {

    }

    @Override
    public void dailyStandUp() {

    }
}
