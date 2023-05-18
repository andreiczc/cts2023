package ro.ase.cts.memento;

import java.util.Stack;

public class Main {

    /**
     * Document
     * You want to be able to undo
     *
     * Document contains -> String: content, private
     * You don't want to break encapsulation
     *
     */

    public static void main(String[] args) {
        var documentEditor = new DocumentEditor();
        documentEditor.edit("test");
        documentEditor.print();
        documentEditor.edit("test2");
        documentEditor.print();
        documentEditor.undo();
        documentEditor.print();
    }
}