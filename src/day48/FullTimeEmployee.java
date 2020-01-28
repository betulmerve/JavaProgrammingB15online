package day48;

public class FullTimeEmployee extends Employee{

    int monthlySalary;


    public FullTimeEmployee(String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {

        System.out.println("The annual salary of full time employee is "+ (monthlySalary*12) );
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' + "yearly salary "+ (monthlySalary*12)+
                '}';
    }
}
