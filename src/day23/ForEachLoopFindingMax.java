package day23;

public class ForEachLoopFindingMax {

    public static void main(String[] args) {

        long[] salaries={75000L,90000L,65000L,102000L,120000L};

        long maxSalary=salaries[0];

        for (long eachSalary:salaries) {

            if(eachSalary>maxSalary) {
                maxSalary=eachSalary;
            }
        }
        System.out.println(maxSalary);


        long minSalary=salaries[0];
        for(long eachSalary:salaries ) {
            if(eachSalary<minSalary) {
                minSalary=eachSalary;
            }
        }

        System.out.println(minSalary);

    }
}
