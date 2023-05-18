package ro.ase.lab7;

import ro.ase.lab7.model.Document;

public class Main {
    public static void main(String[] args) {
        var document = new Document("hello world");
        document.display();
        document.publish();
        document.display();
    }
}