

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();


        SavingsAccount savingsAccount = new SavingsAccount(1001, 5.0);
        CheckingAccount checkingAccount = new CheckingAccount(1002);

        bank.openAccount(savingsAccount);
        bank.openAccount(checkingAccount);


        savingsAccount.deposit(1000);
        checkingAccount.deposit(200);
        checkingAccount.withdraw(50);
        checkingAccount.withdraw(20);


        bank.updateAccounts();

        System.out.println("Accounts after transactions and updates:");
        bank.printAccounts();
    }
}
