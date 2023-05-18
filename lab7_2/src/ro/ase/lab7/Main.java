package ro.ase.lab7;

import ro.ase.lab7.impl.MessagingApp;
import ro.ase.lab7.impl.MessagingObserver;

public class Main {
    public static void main(String[] args) {
        var messagingApp = new MessagingApp();
        messagingApp.addObserver(new MessagingObserver());
        messagingApp.addObserver(new MessagingObserver());
        messagingApp.addObserver(new MessagingObserver());

        messagingApp.postMessage("hello world");
    }
}