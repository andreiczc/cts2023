package ro.ase.cts.memento;

import java.util.Stack;

public class DocumentEditor {

    private Document document;
    private Stack<Document.Snapshot> snapshots;

    public DocumentEditor() {
        this.document = new Document();
        this.snapshots = new Stack<>();
    }

    void edit(String content) {
        snapshots.push(
                document.replaceAll(content)
        );
    }

    void undo() {
        document.undo(
                snapshots.pop()
        );
    }

    void print() {
        document.print();
    }
}
