package ro.ase.cts.lab1.model;

import ro.ase.cts.lab1.exception.InsufficientBalanceException;
import ro.ase.cts.lab1.exception.NegativeAmountException;

public class OwnedAccount extends Account {

    private final String name;

    public OwnedAccount(String name) {
        super();
        this.name = name;
    }

    @Override
    public void withdraw(int amount) throws NegativeAmountException, InsufficientBalanceException {
        super.withdraw(amount);
        System.out.printf("%s withdrew %d amount\n", this.name,
                amount);
    }

    @Override
    public void deposit(int amount) throws NegativeAmountException {
        super.deposit(amount);
        System.out.printf("%s deposit %d amount\n", this.name,
                amount);
    }

    @Override
    public int getBalance() {
        return super.getBalance();
    }
}
