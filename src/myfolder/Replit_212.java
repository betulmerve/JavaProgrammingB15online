package myfolder;

public class Replit_212 {

    public static void main(String[] args) {


        String[][] mon={ {"euro","1.5"},{"yen","21.5"} ,{"mark","100.0"}   };
        String[][] con={  {"euro","0.003"},{"yen","0.5"} ,{"mark","0.87"}      };

        System.out.println(convertC(mon,con));

        System.out.println((1.5*0.003)+(21.5*0.5)+(100*0.87));
    }

    public static  double convertC(String[][] money,String[][] convertionRate)
    {

        double sum=0;
        for (int x = 0; x < money.length; x++) {

                sum=sum+ (Double.parseDouble(money[x][1]) * Double.parseDouble(convertionRate[x][1]) );

        }

        return sum;






    }

    /*
    convertC([["drachma","11.0"],["sek","5.0"]]   ,   [["drachma","0.6"],["sek","100"]]);
    (11*0.6 + 5*100)
    convertC([["yen","5.0"],["frank","5.0"]]   ,   [["yen","1"],["frank","1"]]);
    (5*1 + 5*1)
     */
}
