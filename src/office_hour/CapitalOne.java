package office_hour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapitalOne {
    /*
    create List of Testers, and store two objects of Testers class
			create List of Developers, and store two objects of Developers class
			create List of ScrumTeam, and store the list of Testers and Developers
			use for each loop to print out each of the scrum team member's EmployeeInfo
     */

    public static void main(String[] args) {

        Testers t1=new Testers("Hasan","SDET",120000);
        Testers t2=new Testers("Zeynep","Manual Tester",80000);
        List<Testers> testersList=new ArrayList<>();
        testersList.addAll(Arrays.asList(t1,t2));



        Developers d1=new Developers("Ayse","Senior Dev",140000);
        Developers d2=new Developers("Serdar","Junior Dev",60000);
        List<Developers> developersList=new ArrayList<>();
        developersList.addAll(Arrays.asList(d1,d2));

        List<ScrumTeam> scrumTeamList= new ArrayList<>();
        scrumTeamList.addAll(testersList);
        scrumTeamList.addAll(developersList);


        for (ScrumTeam each:scrumTeamList) {

            each.employeeInfo();

        }

        System.out.println("==============");

        BA b1=new BA("Fatih",60000);
        BA b2=new BA("Emel",70000);

        BA[] beateam={b1,b2};
        Testers[] testersTeam={t1,t2};

        ScrumTeam[][] scrum={beateam,testersTeam};

        for (ScrumTeam[] eachArray:scrum) {

            for (ScrumTeam eachMem:eachArray) {

                eachMem.employeeInfo();
            }
        }




    }


}
