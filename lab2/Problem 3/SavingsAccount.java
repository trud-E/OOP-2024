
public class SavingsAccount extends Account{
    private double percent;
    public SavingsAccount(int a, double percent) {
        super(a);
        this.percent = percent;
    }
    public void calculatePercent() {
        double interest = getBalance() * percent / 100;
        deposit(interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + "percent=" + percent + ", accountNumber=" + getAccountNumber() + ", balance="
                + getBalance() + '}';
    }

}
