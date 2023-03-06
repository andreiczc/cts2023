package ro.ase.cts.lab1.model;

import ro.ase.cts.lab1.exception.NegativeAmountException;

public class AdminBanker implements Banker {

    private String name;

    public AdminBanker(String name) {
        this.name = name;
    }


    @Override
    public Account openAccount(AccountType accountType, String holder, int initialAmount) throws NegativeAmountException {
        if(initialAmount < 0) {
            throw new NegativeAmountException();
        }

        Account account = null;
        switch (accountType) {
            case CURRENT:
                account = new CurrentAccount(holder);
                account.deposit(initialAmount);
                break;
            case CREDIT:
                account = new CreditAccount(holder);
                account.deposit(initialAmount);
                break;
            case SAVINGS:
                account = new SavingsAccount(holder, initialAmount);
                break;
        }

        System.out.printf("Banker %s has opened an account for %s. Account ID: %d\n",
                this.name, holder, account.id);

        return account;
    }
}
