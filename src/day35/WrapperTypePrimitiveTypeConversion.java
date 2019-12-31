package day35;

public class WrapperTypePrimitiveTypeConversion {

    public static void main(String[] args) {

        Integer num1=100;  //auto-boxing  cunku objecte cevirdik

        // Integer.valueOf(..) is a method that return Integer Object
        // it has 2 overloaded version one that accept number , another accept String
        // BUT BOTH OF THEM RETURN INTEGER OBJECT

        int num2=Integer.valueOf("200");  //auto-unboxing cunku primitive cevirdik

        //object has an action!! unutma
        //num1. dersen birsuru method cikiyor
        //ama num2. dersen birsey cikmiyor cunku primitive pure value attribute yok

        int num3=Integer.parseInt("200");


        /*
         * Integer.parseInt("numberHere")
         *    it return an int value converted from String
         *
         * Integer.valueOf("numberHere")
         *  it return an Integer Object by wrapping up the number
         *
         * YOU MAY USE WHICHEVER YOU WANT BECAUSE :
         * Auto-boxing and Auto-unboxing will take care of the conversion anyway
         * */


        // Use this number IPR2012-00001 and store the year into a int variable
        // This case number always start with 3 character either IPR , PGR , CBM , DER
        // followed by year , followed by dash and 5 digit number

        String caseNumber="IPR2012-00001";
        String  strYear=caseNumber.split("-")[0].substring(3);
        //String strYear=caseNumber.substring(3,7);
        int year=Integer.parseInt(strYear);
        System.out.println("year = " + year);


        System.out.println(getYearOutOfCaseNumber("DER2019-00034"));
        System.out.println(getYearOutOfCaseNumber("IPR2009-00034"));
        System.out.println(getYearOutOfCaseNumber("CBM2001-00034"));

        // how can we turn a String into a float value
        float f6=Float.parseFloat("3.14f");
        System.out.println(f6);
    }

    public static int getYearOutOfCaseNumber(String caseNumber) {


        // do validation on case number
        //TODO : Case number should always start with either
        // CBM , IPR, PGR , DER
        // FOLLOWED BY 4 DIGIT NUMBER
        // FOLLOWED BY -
        // AND FOLLOWED BY 5 DIGIT

        String strYear=caseNumber.substring(3,7);
        int year=Integer.parseInt(strYear);
        return year;

        //sadece tek bir satirda bu sekilde de yapabiliriz
        //return Integer.parseInt(caseNumber.substring(3,7));


    }
}
