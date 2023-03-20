package ro.ase.lab4;

import ro.ase.lab4.exception.InsufficientFundsException;
import ro.ase.lab4.interfaces.Card;
import ro.ase.lab4.model.CardFactory;
import ro.ase.lab4.model.CardType;
import ro.ase.lab4.model.CreditCard;

public class Application {

    public static void main(String[] args) throws InsufficientFundsException {
        // Card card = new CreditCard(100); // this shouldn't be possible
        // -> CardFactory.getCard(CardType.CREDIT, 100)
        Card card = CardFactory.getCard(CardType.DEBIT, 100);
        card.withdraw(1000);
    }

}
