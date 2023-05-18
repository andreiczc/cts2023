package ro.ase.lab7.model;

public abstract class State {

    protected Document document;

    public State(Document document) {
        this.document = document;
    }

    public abstract void display();

    public abstract void publish();
}
