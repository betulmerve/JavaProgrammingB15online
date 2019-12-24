package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        /*
        create a long array of 5 items called salaries
        put your salary amounts that ok for your offer

        use for each loop iterate over them

        optionally;
        print only the salary more than 100000
         */


        long[] salaries={75000L,90000L,65000L,102000L,120000L};

        for (long eachSalary:salaries) {

            System.out.println("eachSalary = " + eachSalary);

        }

        for (long salary:salaries) {

//            if(salary>100000) {
//                System.out.println("salary = " + salary);
//            }
            //how can i skip salaries <=100000?

            if(salary<=100000) {
                continue;
            } else {
                System.out.println("salary = " + salary);
            }

        }


    }
}
