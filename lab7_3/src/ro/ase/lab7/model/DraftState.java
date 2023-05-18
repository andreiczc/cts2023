package ro.ase.lab7.model;

public class DraftState extends State{

    private final static String HEADER = "****DRAFT****";

    public DraftState(Document document) {
        super(document);
    }

    @Override
    public void display() {
        System.out.printf("%s\n%s\n", HEADER, document.getContent());
    }

    @Override
    public void publish() {
        document.setState(new PublishedState(document));
    }
}
