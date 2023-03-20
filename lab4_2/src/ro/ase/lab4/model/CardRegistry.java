package ro.ase.lab4.model;

import ro.ase.lab4.interfaces.Card;

import java.util.HashMap;
import java.util.Map;

public class CardRegistry {

    private static Map<CardType, Card> instances = new HashMap<>();

    public static synchronized Card getCard(CardType type, int amount) {
        switch (type) {
            case CREDIT -> {
                if(!instances.containsKey(type)) {
                    instances.put(type, new CreditCard(amount));
                }

                return instances.get(type);
            }
            case DEBIT -> {
                if(!instances.containsKey(type)) {
                    instances.put(type, new DebitCard(amount));
                }

                return instances.get(type);
            }
            default -> {
                throw new UnsupportedOperationException();
            }
        }
    }

}
