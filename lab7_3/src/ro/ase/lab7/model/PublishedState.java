package ro.ase.lab7.model;

public class PublishedState extends State{

    public PublishedState(Document document) {
        super(document);
    }

    @Override
    public void display() {
        System.out.println(document.getContent());
    }

    @Override
    public void publish() {
        // we do nothing, final state
    }
}
