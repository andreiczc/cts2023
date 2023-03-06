package ro.ase.cts.lab1.model;

import ro.ase.cts.lab1.exception.InsufficientBalanceException;
import ro.ase.cts.lab1.exception.InvalidAccountException;
import ro.ase.cts.lab1.exception.NegativeAmountException;

public abstract class Account {

    protected final int id;
    private int balance;

    private static int ID_GENERATOR;

    public Account() {
        this.id = ++ID_GENERATOR;
        this.balance = 0;
    }

    public void withdraw(int amount) throws NegativeAmountException, InsufficientBalanceException {
        if(amount <= 0) {
            throw new NegativeAmountException();
        }

        if(amount > this.balance) {
            throw new InsufficientBalanceException();
        }

        this.balance -= amount;
    }

    public void deposit(int amount) throws NegativeAmountException {
        if(amount <= 0) {
            throw new NegativeAmountException();
        }

        this.balance += amount;
    }

    protected void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void transfer(Account destination, int amount) throws InvalidAccountException, NegativeAmountException, InsufficientBalanceException {
        if(destination == null) {
            throw new InvalidAccountException();
        }

        this.withdraw(amount);
        destination.deposit(amount);
    }
}
