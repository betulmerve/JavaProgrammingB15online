package office_hour;

public class BA extends ScrumTeam {


    public BA(String employeeName, double salary) {
        this.employeeName=employeeName;
        this.salary=salary;
        this.jobTitle="Business Analyst";
    }

    @Override
    public void demo() {
        System.out.println("BA "+ this.employeeName+ " is doing demo");
    }

    @Override
    public void dailyStandUp() {

        System.out.println("BA "+this.employeeName+" is attending meeting ");
    }
    public void gatherRequest() {
        System.out.println("BA "+this.employeeName+" is gathering request");
    }
}
