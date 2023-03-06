package ro.ase.cts.lab1.model;

import ro.ase.cts.lab1.exception.InsufficientBalanceException;
import ro.ase.cts.lab1.exception.NegativeAmountException;
import ro.ase.cts.lab1.exception.NoDepositAllowedException;

public class SavingsAccount extends Account{

    private String holder;
    private int originalAmount;

    public SavingsAccount(String holder, int amount) throws NegativeAmountException {
        this.holder = holder;
        this.originalAmount = amount;
        super.deposit(amount);
    }

    @Override
    public void deposit(int amount) throws NegativeAmountException {
        throw new NoDepositAllowedException();
    }

    @Override
    public void withdraw(int amount) throws NegativeAmountException, InsufficientBalanceException {
        // if the new balance is less than 90 % amount, throw InsufficientBalanceException
        if(this.getBalance() - amount < 0.9 * originalAmount) {
            throw new InsufficientBalanceException();
        }

        super.withdraw(amount);
    }
}
