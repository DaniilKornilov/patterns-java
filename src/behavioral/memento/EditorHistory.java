package behavioral.memento;

import java.util.Deque;
import java.util.LinkedList;

public class EditorHistory {

    private final Deque<Editor.Memento> mementos = new LinkedList<>();

    private final Editor editor;

    public EditorHistory(Editor editor) {
        this.editor = editor;
    }

    public void backupState() {
        Editor.Memento memento = editor.createMemento();
        mementos.push(memento);
    }

    public void undoChange() {
        if (!mementos.isEmpty()) {
            Editor.Memento memento = mementos.pop();
            editor.setMemento(memento);
        }
    }

}
