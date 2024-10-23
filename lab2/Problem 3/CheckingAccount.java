
public class CheckingAccount extends Account {

    private int count = 0;
    private int FREETRANSACTIONS = 5;

    public CheckingAccount(int a) {
        super(a);
    }

    public void setCount() {
        count++;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        setCount();
        deductfee();
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        setCount();
        deductfee();
    }

    public void deductfee() {
        if (count>FREETRANSACTIONS) {
            System.out.println("Used free transactions");
            super.withdraw(0.02);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "count=" + count +
                ", balance=" + getBalance() +
                ", FREETRANSACTIONS=" + FREETRANSACTIONS +
                '}';
    }
}
