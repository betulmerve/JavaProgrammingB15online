package myfolder;

public class FindTheSecondMax {

    public static void main(String[] args) {

        int[]  grades ={1,2,3,4,5,6,7,8};  //result should be 7

        int maxGrade=grades[0];

        for (int eachGrade:grades) {

            if(eachGrade>maxGrade) {
                maxGrade=eachGrade;
            }

        }

        int secondMaxGrade=0;

        for (int eachGrade:grades) {

            if (eachGrade==maxGrade) {
                continue;
            }

            if(eachGrade>secondMaxGrade) {
                secondMaxGrade=eachGrade;
            }

        }

        System.out.println(secondMaxGrade);

    }
}
