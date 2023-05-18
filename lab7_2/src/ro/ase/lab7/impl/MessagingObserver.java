package ro.ase.lab7.impl;

import ro.ase.lab7.api.Observer;

public class MessagingObserver implements Observer {

    @Override
    public void notifyObserver(String text) {
        System.out.printf("Received new text message: %s\n", text);
    }
}
