package ro.ase.cts.lab1.model;

import ro.ase.cts.lab1.exception.InsufficientBalanceException;
import ro.ase.cts.lab1.exception.NegativeAmountException;

public class AnonymousAccount extends Account{

    public AnonymousAccount() {
        super();
    }

    @Override
    public void withdraw(int amount) throws NegativeAmountException, InsufficientBalanceException {
        super.withdraw(amount);
        System.out.printf("%d withdrew %d amount\n", super.id, amount);
    }

    @Override
    public void deposit(int amount) throws NegativeAmountException {
        super.deposit(amount);
        System.out.printf("%d deposit %d amount\n", super.id, amount);
    }

    @Override
    public int getBalance() {
        return super.getBalance();
    }
}
