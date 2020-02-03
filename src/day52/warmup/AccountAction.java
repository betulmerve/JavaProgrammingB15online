package day52.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AccountAction {

    public static void main(String[] args) {

        Account a1=new Account("merve",10000);
        System.out.println("a1 = " + a1);
        a1.deposit(5000);
        System.out.println("a1 = " + a1);
        a1.withdraw(10000);
        System.out.println("a1 = " + a1);


        Account a2=new Account("bilal",20000);
        System.out.println("a2 = " + a2);
        a1.transferAll(a2);
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        a1.deposit(10000);


        Account a3=new Account("ali",50000);

        Account a4=new Account("nurses run",5000);
        System.out.println(a4.isPalindrome());
        System.out.println(a2.isPalindrome());

        List<Account> lst= Arrays.asList(a1,a2,a3,a4);
        System.out.println(" before sort lst = " + lst);
        Collections.sort(lst);
        System.out.println(" after sort lst = " + lst);
    }
}
