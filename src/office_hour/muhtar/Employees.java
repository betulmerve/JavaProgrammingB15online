package office_hour.muhtar;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Employees {
    String employeeName;
    int employeeID;
    String jobTitle;

    public abstract void working();


}
class Developers extends Employees {

    public Developers(String employeeName, int employeeID,String jobTitle) {
        this.employeeName=employeeName;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
    }

    @Override
    public void working() {

    }

    @Override
    public String toString() {
        return "Developers{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

class Testers extends Employees{

    public Testers(String employeeName, int employeeID,String jobTitle) {
        this.employeeName=employeeName;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
    }

    @Override
    public void working() {

    }

    @Override
    public String toString() {
        return "Testers{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
class ScrumTeam{
    List<Developers> devTeam;
    List<Testers> testersTeam;

    public void addNewTester(Testers t) {
        testersTeam.add(t);
    }
    public void addNewDeveloper(Developers d) {
        devTeam.add(d);
    }

    public ScrumTeam(List<Developers> devTeam, List<Testers> testersTeam) {
        this.devTeam = devTeam;
        this.testersTeam = testersTeam;
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "devTeam=" + devTeam +
                ", testersTeam=" + testersTeam +
                '}';
    }
}

class BankofAzerbaijan{
    public static void main(String[] args) {
        Testers t1=new Testers("Ayse",101,"manual tester");
        Testers t2=new Testers("Fatma",102,"automation tester");
        Testers t3=new Testers("Asya",103,"manual tester");
        Testers t4=new Testers("Zeynep",104,"SDET");
        Testers t5=new Testers("Ali",105,"QA");

        Developers d1=new Developers("Zehra",106,"senior dev");
        Developers d2=new Developers("Gul",107,"junior dev");
        Developers d3=new Developers("Nur",108,"senior dev");
        Developers d4=new Developers("Mustafa",109,"junior dev");
        Developers d5=new Developers("Mehmet",110,"senior dev");

        List<Testers> testersList=new ArrayList<>(Arrays.asList(t1,t2,t3,t4,t5));
        List<Developers> developersList=new ArrayList<>(Arrays.asList(d1,d2,d3,d4,d5));

        ScrumTeam st=new ScrumTeam(developersList,testersList);

        st.addNewTester(new Testers("Seda",111,"manual tester"));
        st.addNewTester(new Testers("Serife",112,"SDET"));
        st.addNewTester(new Testers("Samil",113,"QA"));

        System.out.println("st = " + st);


        for (Testers each:testersList) {
            System.out.println("each.employeeName = " + each.employeeName);
        }

        for (Developers each:developersList) {
            System.out.println("each.employeeName = " + each.employeeName);
        }

    }
}



