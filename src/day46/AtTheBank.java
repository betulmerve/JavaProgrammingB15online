package day46;

public class AtTheBank {

    public static void main(String[] args) {

        CheckingAccount c1=new CheckingAccount("zehra",3675474,10000);
        c1.deposit(100);
        System.out.println("c1 = " + c1);
        c1.deposit(5000);
        System.out.println("c1 = " + c1);
        c1.withdraw(5300);
        System.out.println("c1 = " + c1);
    }
}
