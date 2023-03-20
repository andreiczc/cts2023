package ro.ase.lab4.model;

import ro.ase.lab4.exception.InsufficientFundsException;
import ro.ase.lab4.interfaces.Card;

public class DebitCard extends Card {

    DebitCard(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(int amount) throws InsufficientFundsException {
        if(balance < amount) {
            throw new InsufficientFundsException();
        }

        balance -= amount;
    }
}
