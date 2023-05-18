package ro.ase.lab7.impl;

import ro.ase.lab7.api.Observer;

import java.util.ArrayList;
import java.util.List;

public class MessagingApp {

    private List<Observer> observers;

    public MessagingApp() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(String text) {
        for(var observer : observers) {
            observer.notifyObserver(text);
        }
    }

    public void postMessage(String text) {
        // distribute the message to all followers
        notifyObservers(text);
    }

}
