package ro.ase.cts.lab1.model;

import ro.ase.cts.lab1.exception.NegativeAmountException;

public class RegularBanker implements Banker{

    private String name;

    public RegularBanker(String name) {
        this.name = name;
    }

    @Override
    public Account openAccount(AccountType accountType, String holder, int initialAmount) throws NegativeAmountException {
        // only allowed to open current accounts
        if(accountType != AccountType.CURRENT) {
            throw new UnsupportedOperationException();
        }

        if(initialAmount < 0) {
            throw new NegativeAmountException();
        }

        var account = new CurrentAccount(holder);
        account.deposit(initialAmount);

        System.out.printf("Banker %s has opened an account for %s. Account ID: %d\n",
                            this.name, holder, account.id);

        return account;
    }
}
