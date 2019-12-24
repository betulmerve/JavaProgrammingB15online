package day27;

public class MultiDArraysTaskv2 {

    public static void main(String[] args) {

        String[] developersTeam={"Vladislav","Hasan","Tolkun","Abide"};
        String [] testersTeam={"Zhibekchach","Mohammed Sohrabi","NurSultan"};
        String [] businessAnalystsTeam={"Lisa","Ershad","Naila"};

        String[][] scrumTeam={  developersTeam, testersTeam,businessAnalystsTeam  };

        //find out the longest name in the scrumTeam


        String theLongestName=scrumTeam[0][0];

        for (String[] eachTeam:scrumTeam) {

            for (String eachPerson:eachTeam) {

                if (eachPerson.length()>theLongestName.length()) {
                    theLongestName=eachPerson;
                }

            }

        }

        System.out.println("The longest name in the team is "+theLongestName);

        //yalniz bu durumda ilk en uzun ismi basiyor
        //eger ayni uzunluktaki en uzun tum isimleri basmak istersen
        //en uzun karakter sayisini bulup o uzunluktaki tum isimleri bastirman lazim asagidaki gibi


       int maxLength=scrumTeam[0][0].length();

        for (String[] eachTeam:scrumTeam) {

            for (String eachPerson:eachTeam) {

                if (eachPerson.length()>maxLength) {
                    maxLength=eachPerson.length();
                }

            }

        }


        for (String[] eachTeam:scrumTeam) {

            for (String eachPerson:eachTeam) {

                if (eachPerson.length()==maxLength) {
                    System.out.println("The person who has the longest name is :");
                    System.out.println(eachPerson);;
                }

            }

        }





    }
}
