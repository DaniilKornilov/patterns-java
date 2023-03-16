package behavioral.memento;

public class Editor {

    private String state;

    public Editor(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    void setMemento(Memento memento) {
        this.state = memento.state;
    }

    Memento createMemento() {
        return new Memento(state);
    }

    static class Memento {

        private final String state;

        private Memento(String state) {
            this.state = state;
        }

    }

}
