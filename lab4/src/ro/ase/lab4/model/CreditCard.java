package ro.ase.lab4.model;

import ro.ase.lab4.exception.InsufficientFundsException;
import ro.ase.lab4.interfaces.Card;

public class CreditCard extends Card {

    CreditCard(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(int amount) throws InsufficientFundsException {
        super.withdraw(amount);
    }
}
