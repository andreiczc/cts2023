package ro.ase.lab4.interfaces;

import ro.ase.lab4.exception.InsufficientFundsException;

public abstract class Card {

    protected int balance;

    public Card(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if(amount <= 0) {
            throw new IllegalArgumentException();
        }

       this.balance -= amount;
    }

    public void deposit(int amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException();
        }

        this.balance += amount;
    }

}
