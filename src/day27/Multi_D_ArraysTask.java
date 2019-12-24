package day27;

public class Multi_D_ArraysTask {

    public static void main(String[] args) {

        int[][] numbers={ {12,11,10,19}, {19,20,15}     };

        int max=numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j]>max) {
                    max=numbers[i][j];
                }

            }

        }

        System.out.println("Max value is "+max);


        //solution 2 with for each loop

        int max2=numbers[0][0];

        for (int [] each1DArray:numbers) {

            for (int eachElement:each1DArray) {

                if (eachElement>max2) {
                    max2=eachElement;
                }

            }

        }

        System.out.println("Max value is "+max2);

        //finding the min num

        int min=numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j]<min) {
                    min=numbers[i][j];
                }

            }

        }

        System.out.println("Min number is "+min);
    }
}
