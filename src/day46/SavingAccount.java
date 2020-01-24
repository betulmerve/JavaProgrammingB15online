package day46;

public class SavingAccount extends BankAccount {

    double interestRate;


    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate) {
        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;
    }



    // in our SavingAccount , if you withdraw any amount of money
    // you will get 30 dollar penalty
    // so we will override the withdraw method to reflect this requirement


    @Override
    public void withdraw(int amount) {
        //balance=balance-amount-30;
        super.withdraw(amount);
        super.withdraw(30);
    }

    @Override // this is called annotation
    // it will ensure this is actually a valid overridden method
    // if any rule does not match , it will not even compile
    public void deposit(int amount) {
        super.deposit(amount);
        balance=balance+(amount*interestRate);
    }




    @Override // its optional , once being used , it will enforce overriding rule
    // if any rule does not match it will not even compile
    // so it's always good to use it to prevent accidental errors
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {

        SavingAccount s1=new SavingAccount("hasan", 247822645L,500,0.042);
        System.out.println("s1 = " + s1);

        s1.withdraw(100);
        System.out.println("s1 = " + s1);



    }
}
