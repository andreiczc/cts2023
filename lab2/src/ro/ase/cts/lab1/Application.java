package ro.ase.cts.lab1;

import ro.ase.cts.lab1.exception.InsufficientBalanceException;
import ro.ase.cts.lab1.exception.InvalidAccountException;
import ro.ase.cts.lab1.exception.NegativeAmountException;
import ro.ase.cts.lab1.model.Account;
import ro.ase.cts.lab1.model.AnonymousAccount;
import ro.ase.cts.lab1.model.OwnedAccount;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws NegativeAmountException, InsufficientBalanceException, InvalidAccountException {
        Account account = new AnonymousAccount();
        Account account2 = new OwnedAccount("test1");

        try {
            System.out.printf("Balance: %d\n", account.getBalance());
            account.deposit(10);
            System.out.printf("Balance: %d\n", account.getBalance());
            account.withdraw(5);
            System.out.printf("Balance: %d\n", account.getBalance());

            System.out.printf("Balance: %d\n", account2.getBalance());
            account2.deposit(10);
            System.out.printf("Balance: %d\n", account2.getBalance());
            account2.withdraw(5);
            System.out.printf("Balance: %d\n", account2.getBalance());
        } catch (NegativeAmountException e) {
            System.out.println("Negative amount has been entered for withdraw");
        } catch (InsufficientBalanceException e) {
            System.out.println("Balance is insufficient for withdraw");
        }

        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(account2);

        for(int i = 0; i < accounts.size(); ++i) {
            System.out.printf("Count %d has balance %d\n",
                    i, accounts.get(i).getBalance());
        }

        for(Account currentAccount : accounts) {
            System.out.printf("Account has balance %d\n",
                    currentAccount.getBalance());
        }

        account.transfer(account2, 5);
        System.out.printf("Account1 balance: %d\n", account.getBalance());
        System.out.printf("Account2 balance: %d\n", account2.getBalance());
    }
}
