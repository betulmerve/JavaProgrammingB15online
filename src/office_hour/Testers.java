package office_hour;

public class Testers extends ScrumTeam {

    public Testers(String employeeName, String jobTitle, double salary) {
        this.employeeName=employeeName;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }

    public void foundBug() {
        System.out.println("Tester " +this.employeeName+ " reported a bug");
    }

    @Override
    public void demo() {
        System.out.println("Tester "+ this.employeeName+ " is doing demo");
    }

    @Override
    public void dailyStandUp() {

        System.out.println("Tester "+ this.employeeName + " is attending meeting");
    }
}
