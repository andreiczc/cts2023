package ro.ase.lab4.model;

import ro.ase.lab4.interfaces.Card;

public class CardFactory {

    public static Card getCard(CardType type, int amount) {
        switch (type) {
            case CREDIT -> {
                return new CreditCard(amount);
            }
            case DEBIT -> {
                return new DebitCard(amount);
            }
            default -> {
                throw new UnsupportedOperationException();
            }
        }
    }

}
