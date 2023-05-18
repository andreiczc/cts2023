package ro.ase.cts.memento;

/*
Document:
    - content: String

Snapshot:
    - content: String

 */

public class Document {

    private String content;

    public Document() {
    }

    Snapshot replaceAll(String content) {
        var old = new Snapshot(this.content);
        this.content = content;

        return old;
    }

    void undo(Snapshot snapshot) {
        this.content = snapshot.content;
    }

    void print() {
        System.out.println(content);
    }

    public class Snapshot {
        private String content;

        public Snapshot(String content) {
            this.content = content;
        }
    }
}
