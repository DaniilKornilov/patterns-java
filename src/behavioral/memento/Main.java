package behavioral.memento;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor("State1");
        EditorHistory editorHistory = new EditorHistory(editor);
        editorHistory.backupState();

        editor.setState("State2");
        editorHistory.backupState();

        editor.setState("State3");
        editorHistory.backupState();

        editorHistory.undoChange();
        System.out.println(editor.getState());

        editorHistory.undoChange();
        System.out.println(editor.getState());

        editorHistory.undoChange();
        System.out.println(editor.getState());
    }

}
