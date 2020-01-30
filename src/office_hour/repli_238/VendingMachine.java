package office_hour.repli_238;

public abstract class VendingMachine {

    public abstract void select(int itemNumber);
    public abstract double pay(double money);
    public abstract double returnChange();
    public abstract void cancel();
}
