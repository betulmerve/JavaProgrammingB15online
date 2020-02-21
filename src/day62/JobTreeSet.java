package day62;

import day61.Job;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {

        // Create a SortedSet of Job(from day 61) with TreeSet implementation
        // add 5 jobs and print them out vertically and see what you get

        SortedSet<Job> sortedJob=new TreeSet<>();
        sortedJob.add(new Job("FL", 130000, "AT&t"));
        sortedJob.add(new Job("LA", 140000, "BBC"));
        sortedJob.add(new Job("TX", 120000, "Apple"));
        sortedJob.add(new Job("CA", 100000, "Amazon"));
        sortedJob.add(new Job("VA", 110000, "USPTO"));

        System.out.println("sortedJob = " + sortedJob);

        for (Job each:sortedJob) {

            System.out.println("each = " + each);

        }
//
//        Iterator<Job> myIter=sortedJob.iterator();
//        while (myIter.hasNext()) {
//            System.out.println("myIter = " + myIter.next());
//        }

        // How does HashSet decide 5 Person object (name,age) are duplicate or not
        // get the most paying job Company Name and Location

        Job bestSalaryJob = sortedJob.last();
        System.out.println("Best Salary Job Company Name = " + bestSalaryJob.getCompanyName()
                + ",  Located at " + bestSalaryJob.getLocation());


    }
}
