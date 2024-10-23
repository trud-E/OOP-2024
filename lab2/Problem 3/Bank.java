

import java.util.Vector;

public class Bank {
    static private Vector<Account> accounts = new Vector<>();
    
    public void openAccount(Account account) {
        accounts.add(account);
    }
    public void closeAccount(int accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accountNumber);
    }


    public void updateAccounts() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).calculatePercent();
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductfee();
            }
        }
    }

    public void printAccounts() {
        for (Account account : accounts) {
            account.print();
        }
    }
}
