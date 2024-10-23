
public class Account {
    private double balance;
    private int accNumber;

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double sum){
        if(sum>0){
            balance += sum;
        }

    }
    public void withdraw(double sum){
        if(sum>0 && sum<=balance){
            balance -= sum;
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }
    public void transfer(double amount, Account other){
        if(amount>0 && amount <= balance){
            balance -= amount;
            other.balance += amount;
        }
    }

    @Override
    public String toString() {
        return "Account{" + "accNumber=" + accNumber + ", balance=" + balance + '}';
    }

    public final void print(){
        System.out.println(toString());
    }

}
