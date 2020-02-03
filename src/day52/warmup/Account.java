package day52.warmup;

public class Account implements Transferable,Comparable<Account> {

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance=balance+amount;
    }

    public void withdraw(int amount) {
        balance=balance-amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void transferAll(Account otherAccount) {
        otherAccount.balance=otherAccount.balance+this.balance;
        this.balance=0;

//          or we can call the methods
//        otherAccount.deposit(balance);
//        withdraw(balance);

    }

    @Override
    public int compareTo(Account o) {
        if (this.balance>o.balance) {
            return 1;
        } else if (this.balance<o.balance) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean isPalindrome() {

        String reversed="";
        for (int x = this.name.length()-1; x >=0; x--) {

            reversed=reversed+name.charAt(x);
        }

        reversed=reversed.replace(" ","");


        return this.name.replace(" ","").equalsIgnoreCase(reversed);
    }
}
