package day27;

public class MultiDArraysTaskv3 {

    public static void main(String[] args) {

        String[] developersTeam={"Vladislav","Hasan","Tolkun","Abide"};
        String [] testersTeam={"Zhibekchach","Mohammed Sohrabi","NurSultan"};
        String [] businessAnalystsTeam={"Lisa","Ershad","Naila"};

        String[][] scrumTeam={  developersTeam, testersTeam,businessAnalystsTeam  };

        //find out the shortest name


       int minLength=scrumTeam[0][0].length();

        for (String[] eachTeam:scrumTeam) {

            for (String eachPerson:eachTeam) {

                if (eachPerson.length()<minLength) {
                    minLength=eachPerson.length();
                }

            }

        }


        for (String[] eachTeam:scrumTeam) {

            for (String eachPerson:eachTeam) {

                if (eachPerson.length()==minLength) {
                    System.out.println("The person who has the shortest name is: ");
                    System.out.println(eachPerson);;
                }

            }

        }







    }
}
