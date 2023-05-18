package ro.ase.lab7.model;

public class Document {

    private String content;
    private State state;

    public Document(String content) {
        this.content = content;
        this.state = new DraftState(this);
    }

    /**
     * ****DRAFT****, 1st line
     * ****REVIEW***, 1st line
     * empty, 1st line
     */
    public void display() {
        state.display();
    }

    public void publish() {
        state.publish();
    }

    public String getContent() {
        return content;
    }

    public void setState(State state) {
        this.state = state;
    }
}
